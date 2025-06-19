package DecoratorPatternExample;


	public class SMSNotifierDecorator extends NotifierDecorator {

	    public SMSNotifierDecorator(Notifier notifier) {
	        super(notifier);
	    }

	    @Override
	    public void send(String message) {
	        super.send(message); // Send existing notification
	        System.out.println("Sending SMS: " + message);
	    }
	}
