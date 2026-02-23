package org.example.Demo;

import org.springframework.stereotype.Component;

@Component("myBean")
public class GreetingServices {
    public void sayHello(){
        System.out.println("Hello From Spring !");
    }
}
