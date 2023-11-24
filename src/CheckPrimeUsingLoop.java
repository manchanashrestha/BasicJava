
public class CheckPrimeUsingLoop {

	public static void main(String[] args) {
		CheckPrimeUsingLoop objCheckPrimeUsingLoop = new CheckPrimeUsingLoop();
		objCheckPrimeUsingLoop.CheckPrimeorNot(55);
		objCheckPrimeUsingLoop.CheckPrimeinRange(700, 7000);
	}

	// Check prime for single digit and prints result for both positive and negative
	// case.
	public void CheckPrimeorNot(int number) {
		Boolean ifPrime = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				ifPrime = false;
				System.out.println(number + " is not a prime number.");
			}
			if ((i + 1) == number) {
				if (ifPrime == true) {
					System.out.println(number + " is a prime number.");
				}
			}
		}
	}

	// Check all prime numbers starting from 700-7000.
	public void CheckPrimeinRange(int startNumber, int endNumber) {
		CheckPrimeUsingLoop objCheckPrimeUsingLoop = new CheckPrimeUsingLoop();
		// for loop starts from startNumber till endNumber
		for (int x = startNumber; x <= endNumber; x++) {
			objCheckPrimeUsingLoop.CheckPrime(x);
			startNumber++;
		}
	}

	// Only prints the prime number.
	public void CheckPrime(int checkNumber) {
		Boolean ifPrime = true;
		// loops from i till checkNumber
		for (int i = 2; i < checkNumber; i++) {
			if (checkNumber % i == 0) {
				ifPrime = false;
				// Since, the checkNumber is not prime, it exits from for loop.
				break;
			}
			if ((i + 1) == checkNumber) {
				if (ifPrime == true) {
					System.out.println(checkNumber + " is a prime number.");
				}
			}
		}
	}
}
