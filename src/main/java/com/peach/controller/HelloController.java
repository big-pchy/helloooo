package com.peach.controller;

import com.peach.entity.SRSEntity;
import com.peach.service.LinuxService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author:peach
 * @Date:2021/8/21 00:46
 * @Content:
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Resource
    private LinuxService linuxService;

    @GetMapping("/peach")
    public String hello(){
        System.out.println("hello peach");
        return "hello peach";
    }

    @RequestMapping("/publish")
    public String publish(@RequestBody SRSEntity srsEntity){
        System.out.println(srsEntity);
        return "0";
    }

    @RequestMapping("/linux")
    public void publish(){
        linuxService.linux();
    }

}
