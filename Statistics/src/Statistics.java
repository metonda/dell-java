import java.util.Scanner;

public class Statistics {
	public static void main(String[] args) {
//		prompt user to give us numbers separated by commas
		System.out.println("Hi.");
		System.out.println("Give me three numbers, separated by commas.");
		
// scanner
		Scanner reader = new Scanner(System.in);
		String numbers = reader.nextLine();
		System.out.println("Your numbers are " + numbers);
	
// String.split --- store in an array
		String[] numberArray = numbers.split(",");
// create new array --- Integer
		Integer[] intArray = new Integer[numberArray.length];
// Loop through String array
		// for each string, parse to Integer, save in Integer
		for (int i = 0; i < numberArray.length; i++) {
			Integer num = Integer.parseInt(numberArray[i]);
			intArray[i] = num;
		}
		
//		Variable to store current MAXIMUM 
		// First value of num array --- store in current max variable
		int maxNumber = intArray[0];
		
		// For loop: compare current value to current max
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] > maxNumber) {
				maxNumber = intArray[i];
			}
		}
		System.out.println("Maximum number is " + maxNumber);
		
//		Variable to store current MAXIMUM 
		// First value of num array --- store in current min variable
		int minNumber = intArray[0];
		
		// if current value is smaller, replace
		// once for loop ends, whatever is in current min value is the min
		
//		For loop: compare current value to current min
		for (int i = 0; i > intArray.length; i++) {
			if (intArray[i] > minNumber) {
				minNumber = intArray[i];
			}
		}
		System.out.println("Minimum number is " + minNumber);
}}
