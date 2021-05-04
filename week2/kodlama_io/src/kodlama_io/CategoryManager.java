package kodlama_io;

public class CategoryManager {
	
	public void add(Category category) {
		System.out.println("Category : " + category.categoryName + " added.\n");
	}
	
	
	public void delete(Category category) {
		System.out.println("Category : " + category.categoryName + " deleted.");
	}
	
	public void update(Category category) {
		System.out.println("Category : " + category.categoryName + " updated.");
	}

}
