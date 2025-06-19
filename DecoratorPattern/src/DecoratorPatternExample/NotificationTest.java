package DecoratorPatternExample;

public class NotificationTest {
	public static void main(String[] args) {
        // Basic Email Notification
        Notifier emailNotifier = new EmailNotifier();

        // Add SMS Notification
        Notifier smsEmailNotifier = new SMSNotifierDecorator(emailNotifier);

        // Add Slack on top of SMS + Email
        Notifier fullNotifier = new SlackNotifierDecorator(smsEmailNotifier);

        fullNotifier.send("You have a new message!");
    }
}
