package com.miko.mikotest.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HomeController {


    @RequestMapping(value = "/hello",method = {RequestMethod.POST,RequestMethod.GET})
    public String hello(){
        return "Hello";
    }
}
