package oopIntro;

public class Product {
	int id;
	String name;
	double unitPrice;
	String detail;
	
	//default constructor
	public Product() {
		System.out.println("I am a default constructor.");
	}
	
	//parameter contructor
	public Product(int id, String name, double unitPrice, String detail) {
		this();
	    System.out.println("I am a parameter constructor.");
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}

}
