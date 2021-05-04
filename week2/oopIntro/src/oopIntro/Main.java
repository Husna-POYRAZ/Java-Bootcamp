package oopIntro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1, "Lenova V14", 15000, "16 GB Ram");// instance
		
		
		Product product2 = new Product(2, "DELL", 20000, "16 GB Ram"); // instance
		
		
		Product product3 = new Product(); // instance
		product3.id = 1;
		product3.name = "HP 5";
		product3.unitPrice = 15000;
		product3.detail = "16 GB Ram";
		
		
		Product[] products = {product1, product2, product3};
		
		System.out.println("Computer names:");
	    for(Product product : products) {
	    	
	    	System.out.println(product.name);
	    }
		
		System.out.println("Total instance = " + products.length);
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Computer";
		
		Category category2 = new Category();
		category1.id = 2;
		category1.name = "Vehicle";
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);


	}

}
