package org.example.Demo;


import org.example.LooseCoupling.NotificationServices;
import org.springframework.stereotype.Component;

@Component
public class BeanLifeCycle {

    public BeanLifeCycle(NotificationServices notificationServices) {
        System.out.println("Constructor Called : Dependency Injected ");
        this.notificationServices = notificationServices;
    }

    private NotificationServices notificationServices;



    public  void  init() {
        System.out.println(" init called: Bean initialized ");
        notificationServices.Send(" Hello from init() ");
    }

    public void performTask() {
        System.out.println("Ready for use ! ");
    }

    public void cleanUp() {
        System.out.println("CleanedUp is Called ");
    }



}
