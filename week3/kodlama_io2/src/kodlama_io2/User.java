package kodlama_io2;

public class User {
	private int id;
	private String name;
	private String courseName;
	
	public User(int id, String name, String courseName) {
		super();
		this.id = id;
		this.name = name;
		this.courseName = courseName;
	}
	
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
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}
