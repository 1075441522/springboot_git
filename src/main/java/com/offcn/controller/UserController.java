package com.offcn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/save")
    public void getUser() {
        System.out.println("this is xiaoming write");
        System.out.println("this is xiaoming write2");
        System.out.println("this is me write");
        System.out.println("abcdefg");
        System.out.println("11111");
    }
}
