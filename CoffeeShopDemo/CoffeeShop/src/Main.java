import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.util.GregorianCalendar;

import Abstract.BaseCustomerManager;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		Customer customer = new Customer(100, "123456789101", "Hüsna", "Poyraz",new GregorianCalendar(1998, 8 , 10).getTime());
		customerManager.save(customer);
		
		
	}

}