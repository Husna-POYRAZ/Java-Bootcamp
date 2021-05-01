package perfectNumber;

public class Main {

	public static void main(String[] args) {
		int number = 28;
		int total = 0;
		
		for(int i=1 ; i<number; i++) {
			if(number % i == 0)
				total += i;
			else
				continue;
		}
		
		if(number == total)
			System.out.println("The number is perfect number.");
		else
			System.out.println("The number is not perfect number.");
		

	}

}
