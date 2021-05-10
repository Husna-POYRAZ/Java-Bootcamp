package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = {new EmailLogger(), new SmsLogger(), new FileLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer husna = new Customer(1, "Hüsna", "Poyraz");
		customerManager.add(husna);
		customerManager.delete(husna);

	}

}
