package com.luobo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program:springcloud
 * @description:
 * @author:Mr.Chen
 * @create:2019-08-26 22:23
 **/
@RestController
public class Controller {

    @Value("${name}")
    private String name;

    @RequestMapping(value = "/show")
    public String show(){
        return "client-config: "+name;
    }
}
