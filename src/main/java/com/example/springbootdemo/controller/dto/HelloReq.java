package com.example.springbootdemo.controller.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("你好请求")
public class HelloReq {

    @ApiModelProperty("名字")
    private String name;
}
