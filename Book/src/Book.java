
public class Book {

		// attributes
		private String title;
		private String authorFirstName;
		private String authorLastName;

//		constructor
		public Book() {
		}
		
		public Book(String myTitle, String firstName, String lastName) {
			title = myTitle;
			authorFirstName = firstName;
			authorLastName = lastName;
		}
		
//		methods
		public String getTitle() {
			return title;
		}
		public void setTitle(String myTitle) {
			title = myTitle;
		}
		
		public String getAuthorFirstName() {
			return authorFirstName;
		}
		public void setAuthorFirstName(String FirstName) {
			authorFirstName = firstName;
		}
		
		public String getAuthorLastName() {
			return authorFirstName;
		}
		
		public void setAuthorLasttName(String LastName) {
			authorLastName = LastName;
		}
	}

	public String getFullName() {
		return authorFirstName + " " + authorLastName;
	}
	
//	  System.out.println(authorFirstName + " " + authorLastName);
	}

