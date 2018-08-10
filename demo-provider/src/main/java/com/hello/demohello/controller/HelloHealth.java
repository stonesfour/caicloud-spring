package com.hello.demohello.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @PACKAGE_NAME：com.hello.demohello.controller
 * @DATE: 2018/7/24
 * @AURH: shilei
 * @DESC:
 */
@RestController
public class HelloHealth {

    Map map = new HashMap<Integer,String>();

    @GetMapping("/random/{num}")
    public String health(@PathVariable("num") Integer num){

        if(num<0 || num >20 )
            num = 8;
        map.clear();
        for(int i=0;i<num;i++ ){
            map.put(i, i+":"+Math.random());
        }
        String result = JSON.toJSONString(map);
        return result;
    }

    @GetMapping("/health/{name}")
    public String health(@PathVariable("name") String name){

        return "health: "+name;
    }
}
