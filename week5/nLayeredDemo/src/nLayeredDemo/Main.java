package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccsess.concretes.AbcProductDao;
import nLayeredDemo.dataAccsess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		//ToDo; Spring IOC ile ��z�lecek
		ProductService productService = new ProductManager(new AbcProductDao()
				                        ,new JLoggerManagerAdapter());
        
		Product product = new Product(1, 2, "Elma", 12, 50);
		productService.add(product);
		
	}

}
