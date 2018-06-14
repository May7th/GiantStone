package com.oyun.giantstone.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: giantstone
 * @description:
 * @author: changzhen
 * @create: 2018-06-14 09:32
 **/
@Controller
@RequestMapping("/test")
@Slf4j
public class TestController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        log.info("hello");
        return "hello world";
    }
}
