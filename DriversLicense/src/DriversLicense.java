import java.time.*;

class Main {
	  public static void main(String[] args) {
	  LocalDate today = LocalDate.now(); // today's date
	  LocalDate dateOfBirth = LocalDate.of(1960, 01, 21); // date of birth

	  Period period = Period.between(dateOfBirth, today);

	  int age = period.getYears(); // calculate the period between DOB and today in years
	  System.out.println(age);
	  }
	}

public class DriversLicense {

	// attributes
	public String firstName;
	public String lastName;
	public String gender;
	public int heightFt;
	public int heightIn;
	public String dateOfBirth;
	public String fullName;
	public String age;
	
	public static void main(String[] args) {
	}

//	constructor
	public DriversLicense() {
	}
	
//	methods
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLasName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getHeightFt() {
		return heightFt;
	}
	public void setHeightFt(int heightFt) {
		this.heightFt = heightFt;
	}
	
	public int getHeightIn() {
		return heightIn;
	}
	public void setHeightIn(int heightIn) {
		this.heightIn = heightIn;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getFullName() {
		return firstName + " " + lastName;
	}

//	public String getAge() {
//		return 
//	}


	
}


// public Date DOB
// Date d = newDate();
// java.util.Date