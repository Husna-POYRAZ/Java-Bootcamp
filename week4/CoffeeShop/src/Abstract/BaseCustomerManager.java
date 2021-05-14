package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerServise{

	@Override
	public void save(Customer customer) {
		System.out.println("Save to database : " + customer.getFirstName());
	}

}
