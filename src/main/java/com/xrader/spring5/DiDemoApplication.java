package com.xrader.spring5;

import com.xrader.spring5.controllers.ConstructorInjectedController;
import com.xrader.spring5.controllers.MyController;
import com.xrader.spring5.controllers.PropertyInjectedController;
import com.xrader.spring5.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx =  SpringApplication.run(DiDemoApplication.class, args); //run method returns an application context for us
                                                                                        //to work with

        //creates a spring bean with the default name of the class
        //since the context is not strongly typed we have to cast it
        MyController controller = (MyController)ctx.getBean("myController");



        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

    }
}
