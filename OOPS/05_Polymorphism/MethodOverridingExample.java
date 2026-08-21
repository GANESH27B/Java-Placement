class NotificationBase {
    void send() {
        System.out.println("Sending notification");
    }
}

class EmailNotification extends NotificationBase {
    @Override
    void send() {
        System.out.println("Sending email");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        NotificationBase notification = new EmailNotification();
        notification.send();
    }
}