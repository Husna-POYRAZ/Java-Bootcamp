package kodlama_io;

public class Programming extends Category {
	int courseId;
	String courseName;
	String instructorName;
	
	public Programming(int categoryId, String categoryName, int courseId, String courseName, String instructorName) {
		super(categoryId, categoryName);
		this.courseId = courseId;
		this.courseName = courseName;
		this.instructorName = instructorName;
	}
	
	public void add(Programming programming) {
		System.out.println("Course : " + programming.courseName + " added.");
	}
	
	
	public void delete(Programming programming) {
		System.out.println("Course : " + programming.courseName  + " deleted.");
	}
	
	public void update(Programming programming) {
		System.out.println("Course : " + programming.courseName  + " updated.");
	}
	public void courseInfo() {
		System.out.println("Course information : " + "\nId: " + courseId + "\tCourse Name: "+ courseName + 
				           "\tCourse Instructor Name: " + instructorName);	
	}
	
	public void showAllCourse(Programming[] programmingName) {
		System.out.println("\n....Course Name...");
		for(Programming programming : programmingName) {
			System.out.println(programming.courseName);
		}
	}
	
	public void totalCourse(Programming[] programmings) {
		int total = 0;
				
		for(Programming programming : programmings)
			total ++;
		
		System.out.println(total);
	}
	
}
