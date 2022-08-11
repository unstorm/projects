package com.nuxt3.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TestController {

    @GetMapping("/")
    //@CrossOrigin(origins = "http://localhost:3000")
    public String test(){
        return "hello world";
    }

    @GetMapping("/array")
    public List<String> arrayTest(){
        List<String> rtnList = new ArrayList<>();

        rtnList.add("문성순");
        rtnList.add("선주한");
        rtnList.add("선호진");

        return rtnList;
    }
}