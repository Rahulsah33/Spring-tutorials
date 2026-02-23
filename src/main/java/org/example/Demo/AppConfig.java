package org.example.Demo;

import org.example.LooseCoupling.NotificationServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class AppConfig {

    @Bean(initMethod = "init" , destroyMethod = "cleanUp")
    public   BeanLifeCycle beanLifeCycle(NotificationServices notificationServices){
        return  new BeanLifeCycle(notificationServices);
    }


}
