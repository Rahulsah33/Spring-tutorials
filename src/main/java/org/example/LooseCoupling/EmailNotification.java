package org.example.LooseCoupling;

import org.springframework.stereotype.Component;

@Component
public class EmailNotification implements NotificationServices {

    @Override
    public void Send(String message) {
        System.out.println("Email" + message);
    }
}
