package abstractClass;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager(new WomenGameCalculater());
		userManager.getUserScore();
	}

}
