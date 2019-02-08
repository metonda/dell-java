
public class Employee {

		private String name;
		private String jobTitle;
		private int id;
		
//		static var that goes with class
		private static int NEXTID = 100;
		
		public Employee(String empName, String empJobTitle) {
			name = empName;
			jobTitle = empJobTitle;
			id = NEXTID; 
			NEXTID = NEXTID + 1; //increment
		}
	
//		G & S
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
		    return name;
		  }
		public void setName(String name) {
		    this.name = name;
		  }

		public String getJobTitle() {
			return jobTitle;
		}
		public void setJobTitle(String jobTitle) {
			this.jobTitle = jobTitle;
		}

		public static int getNEXTID() {
			return NEXTID;
		}
		public static void setNEXTID(int nEXTID) {
			NEXTID = nEXTID;
		}

	
}
