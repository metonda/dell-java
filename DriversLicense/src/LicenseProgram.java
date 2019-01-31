import java.util.Random;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class LicenseProgram {

	public static void main(String[] args) {
		
		Period year;

		
//		first DL
		DriversLicense myDriversLicense = new DriversLicense();
		myDriversLicense.firstName = "Madison";
		myDriversLicense.lastName = "Dysart";
		myDriversLicense.gender = "F";
		myDriversLicense.heightFt = "4";
		myDriversLicense.heightIn = " ";
		myDriversLicense.dateOfBirth = LocalDate.of(2008, 12, 21);
		myDriversLicense.fullName = (myDriversLicense.firstName + " " + myDriversLicense.lastName);
//		myDriversLicense.age = "10";
	
//		call getYear method
		year = getYears(myDriversLicense.dateOfBirth);
		myDriversLicense.age = Integer.toString(year.getYears());
		
//		second DL
		DriversLicense myDriversLicense2 = new DriversLicense();
		myDriversLicense2.firstName = "Alyse";
		myDriversLicense2.lastName = "Dysart";
		myDriversLicense2.gender = "F";
		myDriversLicense2.heightFt = "5";
		myDriversLicense2.heightIn = "5";
		myDriversLicense2.dateOfBirth = LocalDate.of(2002, 03, 02);
		myDriversLicense2.fullName = (myDriversLicense2.firstName +  " " + myDriversLicense2.lastName);
//		myDriversLicense2.age = "16";

//		call getYear method
		year = getYears(myDriversLicense2.dateOfBirth);
		myDriversLicense2.age = Integer.toString(year.getYears());
		
//		third DL
		DriversLicense myDriversLicense3 = new DriversLicense();
		myDriversLicense3.firstName = "Alex";
		myDriversLicense3.lastName = "Dysart";
		myDriversLicense3.gender = "M";
		myDriversLicense3.heightFt = "5";
		myDriversLicense3.heightIn = "7";
		myDriversLicense3.dateOfBirth = LocalDate.of(2003, 10, 7);
		myDriversLicense3.fullName = (myDriversLicense3.firstName +  " " + myDriversLicense3.lastName);
//		myDriversLicense3.age = "14";

//		call getYear method
		year = getYears(myDriversLicense3.dateOfBirth);
		myDriversLicense3.age = Integer.toString(year.getYears());
	
//		LocalDate today = LocalDate.of(myDriversLicense.dateOfBirth);
//		calculate DOB using example from textbook
//
//		  LocalDate today = LocalDate.now(); // today's date
//		  LocalDate dateOfBirth = LocalDate.of(1960, 01, 21); // date of birth
//
//		  Period period = Period.between(dateOfBirth, today);
//
//		  int age = period.getYears(); // calculate the period between DOB and today in years
//		  System.out.println(age);
		  
		  //print out full name and age -- not working
		  System.out.println(myDriversLicense.fullName);
		  System.out.println(myDriversLicense.age);
		  
		  System.out.println(myDriversLicense2.fullName);
		  System.out.println(myDriversLicense2.age);
		  
		  System.out.println(myDriversLicense3.fullName);
		  System.out.println(myDriversLicense3.age);
		  	 
	}
	public static Period getYears(LocalDate dateOfBirth) {
		  LocalDate today = LocalDate.now(); // today's date

		  Period period = Period.between(dateOfBirth, today);
			return period;
	}
}

