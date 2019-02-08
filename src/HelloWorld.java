import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {

	System.out.println("Hello world!");
	System.out.println("Hi. I'm Tonda. What's your name.");
	Scanner reader = new Scanner(System.in);
	String input = reader.nextLine();
	System.out.println("You typed: " + input);
	System.out.println("Hi, " + input + ". Hope you're having a great Friday.");
	reader.close();
	}

}
