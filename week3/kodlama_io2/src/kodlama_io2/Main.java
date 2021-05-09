package kodlama_io2;

public class Main {

	public static void main(String[] args) {
		System.out.println("\n---- Instructor ----");
		Instructor instructor = new Instructor(100, "Engin", "Java");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		
		
		System.out.println("---- Student ----");
		Student student1 = new Student(01, "Hüsna", "Java");
		Student student2 = new Student(02, "Nur", "C#");
		Student student3 = new Student(03, "Ali", "C#");
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.add(student2);
		studentManager.add(student3);
		
		Student[] students = {student1, student2, student3};
		studentManager.getAll(students);
		
		studentManager.getAll(students);

	}

}
