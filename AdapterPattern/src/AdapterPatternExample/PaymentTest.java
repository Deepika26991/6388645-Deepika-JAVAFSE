package AdapterPatternExample;

	public class PaymentTest {
	    public static void main(String[] args) {
	        // Use PayPal via Adapter
	        PayPal payPal = new PayPal();
	        PaymentProcessor paypalProcessor = new PayPalAdapter(payPal);
	        paypalProcessor.processPayment(1000.0);

	        // Use Stripe via Adapter
	        Stripe stripe = new Stripe();
	        PaymentProcessor stripeProcessor = new StripeAdapter(stripe);
	        stripeProcessor.processPayment(2000.0);
	    }
	}
