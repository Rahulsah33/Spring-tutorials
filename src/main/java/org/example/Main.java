package org.example;

import org.example.LooseCoupling.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        GreetingServices greetingServices =
                (GreetingServices) context.getBean("myBean");
        greetingServices.sayHello();

        UserService userService =
                (UserService) context.getBean("userService");
        userService.notifyUser(" Hey, what's up?");
    }
}