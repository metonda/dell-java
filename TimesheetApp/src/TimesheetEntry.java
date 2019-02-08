import java.time.LocalDateTime;

public class TimesheetEntry {

//	variables
	private String projectName;
	private String task;
	private int id;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private static int NEXTID = 1;
	
//	constructor
	public void TimesheetEntry(String myProject, String myTask) {
	    projectName = myProject;
	    task = myTask;
	    startTime = LocalDateTime.now();
	    id = NEXTID;
	    NEXTID++; 

	}

//	G&S
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

//	Method
	public void updateEndtime() {
		if (endTime.equals(null)) {
			endTime = LocalDateTime.now();
		}
	}
	
	
}
