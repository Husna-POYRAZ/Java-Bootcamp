package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer husna = new IndividualCustomer();
		husna.setCustomerNumber("12345");
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.setCustomerNumber("787879");
		
		Syndicate syndicate = new Syndicate();
		syndicate.setCustomerNumber("47593");
		
		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(hepsiBurada);
		//customerManager.add(husna);
		//customerManager.add(syndicate);
		
		Customer[] customers = {husna, hepsiBurada, syndicate};
		customerManager.addMultipleCustomer(customers);

	}
}
