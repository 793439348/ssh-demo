package com.code.controller;

import com.code.pojo.Dept;
import com.code.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String test() {
        return userService.test();
    }

    @RequestMapping("/add")
    public String add(Dept dept) {
        userService.add(dept);
        return "index";
    }
}
