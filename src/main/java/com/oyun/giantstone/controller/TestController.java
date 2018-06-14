package com.oyun.giantstone.controller;

import com.oyun.giantstone.TestVo;
import com.oyun.giantstone.common.JsonData;
import com.oyun.giantstone.exception.ParamException;
import com.oyun.giantstone.util.BeanValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @program: giantstone
 * @description:
 * @author: changzhen
 * @create: 2018-06-14 09:32
 **/
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    @GetMapping("/hello")
    @ResponseBody
    public JsonData hello(){
        log.info("hello");
        return JsonData.fail("hello world");
    }

    @GetMapping("validate")
    public JsonData validate(@Validated TestVo vo){
        log.info("validate");
        return JsonData.success("test validate");
    }
}
