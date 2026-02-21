package org.example.LooseCoupling;

public class UserService {

    private NotificationServices notificationService;

    public UserService(NotificationServices notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(String message) {
        notificationService.Send("Notification is Popped " + message);
    }
}