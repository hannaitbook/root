package com.example.testWeb.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hanna")
public class Test {

    @RequestMapping(method = RequestMethod.GET, path = "/getMethod")
    public String getMethod(){
        System.out.println("hi~~~~~ ㅋㅋㅋㅋㅋ");
        return "hi~~ getMethod";
    }
}