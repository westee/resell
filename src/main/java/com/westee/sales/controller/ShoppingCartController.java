package com.westee.sales.controller;

import com.westee.sales.entity.AddToShoppingCartRequest;
import com.westee.sales.entity.PageResponse;
import com.westee.sales.entity.Response;
import com.westee.sales.entity.ShoppingCartData;
import com.westee.sales.generate.ShoppingCart;
import com.westee.sales.service.ShoppingCartService;
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

import java.util.ArrayList;
import java.util.Objects;

@RestController
@RequestMapping("/api/v1/")
public class ShoppingCartController {
    ShoppingCartService shoppingCartService;
    UserService userService;

    @Autowired
    public ShoppingCartController(ShoppingCartService shoppingCartService, UserService userService) {
        this.shoppingCartService = shoppingCartService;
        this.userService = userService;
    }

    @GetMapping("shoppingCart")
    public PageResponse<ShoppingCartData> getShoppingCart(
            @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize,
            @RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestHeader("Token") String token) {
        if (Objects.nonNull(token) && token.length() != 0) {
            Long userId = userService.getUserByToken(token).getId();
            return shoppingCartService.getShoppingCartOfUser(pageNum, pageSize, userId);
        } else {
            return PageResponse.pageData(0, 0, 0, new ArrayList<>());
        }
    }

    @PostMapping("shoppingCart")
    public Response<ShoppingCartData> getShoppingCart(@RequestBody AddToShoppingCartRequest request,
                                                      @RequestHeader("Token") String token) {
        Long userId = userService.getUserByToken(token).getId();
        return Response.ok(shoppingCartService.addGoodsToShoppingCart(request, userId));
    }

    @DeleteMapping("shoppingCart/{goodsId}")
    public void deleteShoppingCart(@PathVariable("goodsId") long goodsId,
                                   @RequestHeader("Token") String token) {
        Long userId = userService.getUserByToken(token).getId();
        shoppingCartService.deleteShoppingCart(goodsId, userId);
    }

    @GetMapping("shoppingCart/items/{goodsId}/count")
    public Response<Long> getCountByGoodsId(@PathVariable("goodsId") long goodsId,
                                            @RequestHeader("Token") String token) {
        long count = 0;
        if (Objects.nonNull(token) && !"".equals(token)) {
            Long userId = userService.getUserByToken(token).getId();
            count = shoppingCartService.countByGoodsIdAndUserId(goodsId, userId);
        }
        return Response.ok(count);
    }

    @PatchMapping("shoppingCart/{shoppingCartId}/{number}")
    public Response<ShoppingCart> updateShoppingCartNumber(@PathVariable("shoppingCartId") long shoppingCartId,
                                                           @PathVariable("number") int number,
                                                           @RequestHeader("Token") String token) {
        Long userId = userService.getUserByToken(token).getId();
        return Response.ok(shoppingCartService.updateShoppingCartGoodsNumber(shoppingCartId, number));
    }

}
