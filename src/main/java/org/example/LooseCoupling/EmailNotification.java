package org.example.LooseCoupling;

public class EmailNotification implements NotificationServices {

    @Override
    public void Send(String message) {
        System.out.println("Email" + message);
    }
}
