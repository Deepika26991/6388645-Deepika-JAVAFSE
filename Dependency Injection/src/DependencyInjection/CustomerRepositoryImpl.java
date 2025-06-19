package DependencyInjection;
public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(String id) {
        // Simulate fetching from database
        return "Customer[ID: " + id + ", Name: Deepika]";
    }
}
