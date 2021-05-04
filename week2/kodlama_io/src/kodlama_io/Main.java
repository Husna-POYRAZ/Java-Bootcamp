package kodlama_io;

public class Main {

	public static void main(String[] args) {
		
		Category category1 = new Category(101, "Programming");

		CategoryManager categoryManager = new CategoryManager();
		categoryManager.add(category1);
		
		
		Programming course1 = new Programming(101, "Programming", 1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)","Engin Demiro�");
		Programming course2 = new Programming(101, "Programming", 2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)","Engin Demiro�");
		Programming course3 = new Programming(101, "Programming", 3,"Programlamaya Giri� ��in Temel Kurs","Engin Demiro�");
		
		course1.add(course1);
		course2.add(course2);
		course3.add(course3);
		
		Programming[] programmingName = {course1, course2, course3};
		
		System.out.println("\n...Total Courses...");
		course1.totalCourse(programmingName);
		
		
		course1.showAllCourse(programmingName);
		
		Instructor instructor = new Instructor(1001, "Engin", "Demiro�", "Instructor");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor, course1);
		instructorManager.update(instructor, course2);

	}

}
