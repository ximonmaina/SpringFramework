package com.xrader.spring5.controllers;

import com.xrader.spring5.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by Simon Maina 2/05/18
 *
 */
@Controller  //spring controller managed by the spring context
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello!!!");
        return greetingService.sayGreeting();
    }

}
