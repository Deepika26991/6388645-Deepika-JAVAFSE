package DependencyInjection;
public class CustomerService {
    private CustomerRepository repository;

    // Constructor Injection
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void getCustomerDetails(String id) {
        // ✅ This works because the method is defined in the interface
        String customer = repository.findCustomerById(id);
        System.out.println("📢 " + customer);
    }
}
