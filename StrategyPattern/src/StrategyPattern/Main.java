package StrategyPattern;

	public class Main {
	    public static void main(String[] args) {

	        PaymentContext context = new PaymentContext();

	        // Use Credit Card
	        context.setPaymentStrategy(new CreditCardPayment("1234-XXXX"));
	        context.makePayment(500);

	        // Switch to PayPal
	        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
	        context.makePayment(1200);
	    }
	}
