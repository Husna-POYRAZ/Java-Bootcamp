package abstractClass;

public abstract class GameCalculator {
	
	public abstract void compute();
	
	public final void gameOver() {
		System.out.println("Game over!");
	}
}
