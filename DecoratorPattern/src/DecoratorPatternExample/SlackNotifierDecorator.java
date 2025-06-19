package DecoratorPatternExample;

public class SlackNotifierDecorator extends NotifierDecorator {

    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message); // Send existing notification
        System.out.println("Sending Slack Message: " + message);
    }
}

