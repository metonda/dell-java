import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		//Ask user for a number
		System.out.println("Hi user. Please type a single-digit number into the console.");
		Scanner reader = new Scanner(System.in);
		int input = reader.nextInt();
		
		//Ask user for a second number
		System.out.println("Great. Now type another single-digit number into the console.");
		Scanner reader2 = new Scanner(System.in);
		int input2 = reader.nextInt();
		
		//Give the sum of the two numbers (+)
		Scanner reader3 = new Scanner(System.in);
		int sum = input + input2;
		System.out.println("The sum of your two numbers is "+sum );
		
		//Give difference of two numbers (-)
		Scanner reader4 = new Scanner(System.in);
		int diff = input - input2;
		System.out.println("The difference of your two numbers is "+diff );
		
		//Give product of two numbers (*)
		Scanner reader5 = new Scanner(System.in);
		int prod = input * input2;
		System.out.println("The product of your two numbers is "+prod );
		
		//Give quotient of two numbers (/)
		Scanner reader6 = new Scanner(System.in);
		int quot = input % input2;
		System.out.println("The quotient of your two numbers produces a remainder of "+quot );
		
		
		// Ta-Da!

	}

}
