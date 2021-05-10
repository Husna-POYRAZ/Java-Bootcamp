package inheritance;

public class CustomerManager {
	void add(Customer customer) {
		System.out.println(customer.getCustomerNumber() + " added.");
	}
	
	// Bulk insert
	void addMultipleCustomer(Customer[] customers) {
		for(Customer customer: customers) {
			add(customer);
		}
	}
}
