package com.westee.sales.controller;

import com.westee.sales.entity.Response;
import com.westee.sales.generate.Config;
import com.westee.sales.service.ConfigService;
import com.westee.sales.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/v1/")
public class ConfigController {
    private final ConfigService configService;
    private final UserService userService;

    @Autowired
    public ConfigController(ConfigService configService, UserService userService) {
        this.configService = configService;
        this.userService = userService;
    }

    @PostMapping("config")
    public Response<Config> postConfig(@RequestBody Config config,
                                       @RequestHeader("Token") String token){
        Long userId = userService.getUserByToken(token).getId();
        userService.checkAdmin(userId);
        return Response.ok(configService.updateConfig(config));
    }
}
