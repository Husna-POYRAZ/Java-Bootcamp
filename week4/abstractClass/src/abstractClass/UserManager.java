package abstractClass;

public class UserManager {
	
	private GameCalculator gameCalculator;
	
	//We define parameter constructor for prevent runtime error
	public UserManager(GameCalculator gameCalculator) {
		this.gameCalculator = gameCalculator;
	}
	
	public void getUserScore() {
		gameCalculator.compute();
	}
}
