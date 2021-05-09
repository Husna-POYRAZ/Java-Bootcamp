package kodlama_io2;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getName() + " added.");
	}
	public void update(User user) {
		System.out.println(user.getName() + " updated.");
	}
	public void delete(User user) {
		System.out.println(user.getName() + " deleted.");
	}
	public void getAll(User[] user) {
		System.out.println("***** Student List ******");
		for(int i = 0; i < user.length ; i++) {
			System.out.println(i+1 + ". " + user[i].getName());
		}
	}
	
}
