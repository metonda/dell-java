import java.awt.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class GradeBook {

	public static void main(String[] args) {
//			ask user for number of students
			
//			Loop the scanner to ask "numStudents" times for the name and grades
			
//			need to use the HashMap to store student names and grades
//			key: name and value: an array of grades
			HashMap<String, String> grades = new HashMap<String, String>();
			Scanner reader = new Scanner(System.in);
			
			System.out.println("How many students are in the class?");
			int numOfStudents = Integer.parseInt(reader.nextLine());
			
			HashMap<String, String> gradeBook = new HashMap<String, String>();
			for (int i = 0; i < numOfStudents; i++) {
				System.out.println("What is the name?");
				String name = reader.nextLine();
				System.out.println("Enter " + name + "'s grades, separated by commas.");
				String studentGrades = reader.nextLine();
				
			}}
	
//	you can use the split.method to turn the grades into an array
//	take the value put into an array by using the string.split method
//	this gives you an array of strings
//	turn this into an array of int
//	then get an avg of all int (double or float)
//	then put avg back into a different hashmap HashMap<String, Double>, where string is the name and double is the average

//			HashMap<String, String> gradeBook = new HashMap<String, String>();

			ArrayList<String> names = new ArrayList (grades.keySet());
			
//			for each name, look up their grades and output the average
			
			for (int i = 0; i < names.grade(); i++) {
		        String currentName = names.get(i);
//		        figure out average
		        String avgGrade = grades.get(currentName);

		        System.out.println(currentName + "'s favorite color: " + currentColor);
		    }
			
			HashMap<String, Double> gradeBook = new HashMap<String, String>();
		
		// TODO Auto-generated method stub

	}


