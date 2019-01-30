import java.util.Random;
import java.util.Scanner;
import java.time.*;

public class LicenseProgram {

	public static void main(String[] args) {
		
//		first DL
		DriversLicense myDriversLicense = new DriversLicense();
		myDriversLicense.firstName = "Madison";
		myDriversLicense.lastName = "Dysart";
		myDriversLicense.gender = "F";
		myDriversLicense.heightFt = "4";
		myDriversLicense.heightIn = " ";
		myDriversLicense.dateOfBirth = "12/21/2008";
	
//		I'm lost here
//		myDriversLicense.fullName = (firstName + lastName);
//		myDriversLicense.age = 
	
//		second DL
		DriversLicense myDriversLicense2 = new DriversLicense();
		myDriversLicense2.firstName = "Alyse";
		myDriversLicense2.lastName = "Dysart";
		myDriversLicense2.gender = "F";
		myDriversLicense2.heightFt = "5";
		myDriversLicense2.heightIn = "5";
		myDriversLicense2.dateOfBirth = "3/2/2002";
		
//		third DL
		DriversLicense myDriversLicense3 = new DriversLicense();
		myDriversLicense3.firstName = "Alex";
		myDriversLicense3.lastName = "Dysart";
		myDriversLicense3.gender = "M";
		myDriversLicense3.heightFt = "5";
		myDriversLicense3.heightIn = "7";
		myDriversLicense3.dateOfBirth = "10/7/2003";
	}

//		calculate DOB using example from textbook
	class Main {
		  public void main(String[] args) {
		  LocalDate today = LocalDate.now(); // today's date
		  LocalDate dateOfBirth = LocalDate.of(1960, 01, 21); // date of birth

		  Period period = Period.between(dateOfBirth, today);

		  int age = period.getYears(); // calculate the period between DOB and today in years
		  System.out.println(age);
		  }
		  
//		  print out full name and age -- not working
		  System.out.println(fullName);
		  System.out.println(age);
	}	
}
