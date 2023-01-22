import java.util.*;

public class Recursive {
	/*
	 * The fibonacci sequence is a math function that happens to have a recursive
	 * definition. 
	 * 
	 * Method that returns the n-th fibonacci sequence number
	 */
	public static int fibonacci(int n) {
		//If the n value is 1 or less the method returns n
		if (n <= 1)
			return n;
		// reprtitively requesting the fibonacci() function 
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	// main() method
	public static void main(String args[]) {
		// delare one variable n
		int n;
		// create Scanner class Object
		Scanner scan = new Scanner(System.in);
		// this gets the n value of the user
		System.out.println("Enter the n value: ");
		n = scan.nextInt();
		// the print statement that prints the n-th number in thesequence
		System.out.println("The " + n + "th term of the Fibonacci sequence is " + fibonacci(n));
	}
}
