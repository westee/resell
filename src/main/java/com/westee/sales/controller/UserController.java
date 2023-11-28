package com.westee.sales.controller;

import cn.dev33.satoken.stp.StpUtil;
import com.westee.sales.entity.PageResponse;
import com.westee.sales.entity.Response;
import com.westee.sales.exceptions.HttpException;
import com.westee.sales.generate.User;
import com.westee.sales.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/api/v1/")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("user/list")
    public PageResponse<User> getUserList(@RequestParam(name = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                                          @RequestParam(name = "pageSize", required = false, defaultValue = "10") Integer pageSize,
                                          @RequestHeader("Token") String token) {
        Long userId = userService.getUserByToken(token).getId();
        return userService.getUserList(userId, pageNum, pageSize);
    }

    @GetMapping("user/search")
    public PageResponse<User> getUserByKeyword(@RequestParam(name = "keyword") String keyword,
                                               @RequestParam(name = "type") String type,
                                               @RequestHeader("Token") String token) {
        Long userId = userService.getUserByToken(token).getId();
        userService.checkAdmin(userId);
        return userService.searchUser(keyword, type);
    }

    @PatchMapping("user")
    public Response<User> updateUser(@RequestBody User user, @RequestHeader("Token") String token) {
        User userByToken = userService.getUserByToken(token);

        // 检查用户是否有权限修改
        if (Objects.equals(user.getId(), null)) {
            throw HttpException.badRequest("用户ID不能为空");
        } else if (userByToken.getId().equals(user.getId()) || userService.checkAdmin(userByToken.getId())) {
            return Response.ok(userService.updateUser(user));
        } else {
            throw HttpException.forbidden("没有权限");
        }
    }

    @PostMapping("user")
    public Response<User> updateUser(@RequestBody User user) {
        return Response.ok(userService.insertUser(user));
    }

    @DeleteMapping("user/{userId}")
    public Response<User> deleteUser(@PathVariable Long userId) {
        return Response.ok(userService.deleteUserById(userId));
    }

    @GetMapping("user")
    public Response<User> getUser(@RequestHeader("Token") String token) {
        if (StpUtil.isLogin()) {
            Object loginId = StpUtil.getLoginIdByToken(token);
            User userByToken = userService.getUserById(Long.decode(loginId.toString()));
            return Response.ok(userByToken);
        } else {
            throw HttpException.notAuthorized("用户未登录");
        }
    }
}
