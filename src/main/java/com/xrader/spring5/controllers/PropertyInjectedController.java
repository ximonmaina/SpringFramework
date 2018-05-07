package com.xrader.spring5.controllers;

import com.xrader.spring5.services.GreetingService;
import com.xrader.spring5.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired  //asking spring to inject the dependecy
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;

   public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }



}
