package org.example;

import org.example.Demo.AppConfig;
import org.example.Demo.BeanLifeCycle;
import org.example.Demo.GreetingServices;
import org.example.LooseCoupling.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//        ApplicationContext context =
//                new AnnotationConfigApplicationContext(AppConfig.class);

//        GreetingServices greetingServices =
//                (GreetingServices) context.getBean("myBean");
//        greetingServices.sayHello();

//        UserService userService =
//                (UserService) context.getBean("userService");
//        userService.notifyUser(" Hey, what's up?");


        System.out.println("Starting Spring Application Context");

        ApplicationContext context = new
                AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("Retrieving Lifecycle Bean");
        BeanLifeCycle beanLifeCycle = context.getBean(BeanLifeCycle.class);

        beanLifeCycle.performTask();

        System.out.println("Closing Spring Context");
    }
}