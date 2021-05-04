package kodlama_io;

public class InstructorManager {
	public void add(Instructor instructor, Programming programming) {
		System.out.println("\nInstructor: " + instructor.firstName + " " + instructor.lastName + " added.");
		System.out.println(programming.courseName + " instructor is " + instructor.firstName + " " + instructor.lastName + ".");
	}
	
	public void update(Instructor instructor, Programming programming) {
		System.out.println("\nInstructor Update: " +programming.courseName + " has been updated as instructor  " + instructor.firstName + " " + instructor.lastName + ".");
	}
	
}
