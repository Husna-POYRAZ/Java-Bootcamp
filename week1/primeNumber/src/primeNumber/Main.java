package primeNumber;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 25;
		boolean isPrime = true;
		
		if(number<1)
			System.out.println("Invalid number.");
		
		if(number==1)
			System.out.println("The number is not prime number.");
		
		
		for(int i=2; i<number; i++) {
			
			if(number % i == 0)
				isPrime = false;
		}
		
		if( isPrime == true)
			System.out.println("The number is prime number.");
		
		else 
			System.out.println("The number is not prime number.");

	}

}
