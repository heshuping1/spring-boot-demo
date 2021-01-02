package com.example.springbootdemo.controller;

import com.example.springbootdemo.controller.dto.HelloReq;
import com.example.springbootdemo.controller.dto.HelloRes;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api("你好-v1.0")
@RestController("/hello")
public class HelloController {

    @ApiOperation(value = "你好1")
    @RequestMapping(value = "/sayHello1",method = RequestMethod.POST)
    public HelloRes sayHello1(HelloReq helloReq){
        return new HelloRes("你好！");
    }

    @ApiOperation(value = "你好1")
    @RequestMapping(value = "/sayHello2",method = RequestMethod.POST)
    public HelloRes sayHello2(HelloReq helloReq){
        return new HelloRes("你好！" + helloReq.getName());
    }

}

