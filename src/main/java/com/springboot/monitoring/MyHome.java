package com.springboot.monitoring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyHome {

//    private CounterService counterService;
    @GetMapping("user/home")
    public String home(){

        return  "home";
    }
}
