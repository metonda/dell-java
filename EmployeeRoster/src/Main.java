
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Roster myRoster = new Roster();
    Scanner reader = new Scanner(System.in);
    
    boolean quit = false;

    while(!quit) {
      System.out.println("Command options: add, list, quit");
      String input = reader.nextLine(); //read user input
      if (input.equals("add")) {
    	// prompt for input
    	    System.out.println("Please enter employee name");
    	    String name = reader.nextLine();
//    	    new code here
    	    System.out.println("Please enter employee title");
    	    String title = reader.nextLine();
    	    
    	    Employee emp = new Employee(name, title);
    	    myRoster.addEmployee(emp);
    	        	    
         } else if (input.equals("list")) {
        	 printEmployeeList(myRoster);
        	 
            }
    }
	  
	  System.out.println("Command options: add, list, quit");
    
    Scanner reader = new Scanner(System.in);





Roster myRoster = new Roster();
Employee emp = new Employee(name, title);
myRoster.addEmployee(emp);
  }
}
		
	}

}
