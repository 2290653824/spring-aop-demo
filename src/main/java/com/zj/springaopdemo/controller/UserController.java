package com.zj.springaopdemo.controller;

import com.zj.springaopdemo.annotation.WebLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhengjian
 * @date 2023-07-08 14:23
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/hello")
    @WebLog
    public String hello(String name){
        return "Hello "+name;
    }
}
