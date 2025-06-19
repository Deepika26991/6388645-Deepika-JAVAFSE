package DependencyInjection;

public class Main {
	public static void main(String[] args) {
        // Step 1: Create repository implementation
        CustomerRepository repo = new CustomerRepositoryImpl();

        // Step 2: Inject it into the service
        CustomerService service = new CustomerService(repo);

        // Step 3: Use service to get customer info
        service.getCustomerDetails("C101");
    }
}
