package com.example.springbootdemo.controller;


import com.example.springbootdemo.bean.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户 前端控制器
 * </p>
 *
 * @author Liul
 * @since 2022-04-17
 */
@RestController
@RequestMapping("/user")
@Api(value = "用户接口",tags = "用户相关接口")
public class UserController {

    @GetMapping("getInfo")
    @ApiOperation(value = "查询用户信息")
    public Object getInfo(){
        User user = new User();

        return user;
    }


}
