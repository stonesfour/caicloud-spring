package com.hello.demohello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @PACKAGE_NAME：com.hello.demohello.controller
 * @DATE: 2018/7/24
 * @AURH: shilei
 * @DESC:
 */
@RestController
public class HelloHealth {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/health/{name}")
    public String health(@PathVariable("name") String name){

        return "health: "+name;
    }

    @GetMapping("/demo-hello/{name}")
    public String findById(@PathVariable String name) {
        return this.restTemplate.getForObject("http://demo-provider:8088/health/调用demo-hello，本地传递参数：+" + name, String.class);
    }

    @GetMapping("/demo-hello/{num}}")
    public String findById(@PathVariable Integer num, @PathVariable String desc) {

        return desc + this.restTemplate.getForObject("http://demo-provider:8088/random/" + num, String.class);
    }
}
