import java.util.Scanner;

public class IgnorePrimeorNot {

	public static void main(String[] args) {
		System.out.println("Enter a random number:");
		Scanner scanner = new Scanner(System.in);
		int number = Integer.parseInt(scanner.next());
		System.out.println("The given mumber " + number + " is " + (isPrime(number)? "prime": "not prime."));
	}
	
	public static boolean isPrime(int number) {
		int primeCount = 0;
		for(int i = 1; i<=number; i++) {
			if(number%i==0) {
				primeCount++;
			}
		}
		
		if(primeCount == 2) {
			return true;
		} else {
			return false;
		}
	}
}
