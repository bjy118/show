package dao;

import java.util.ArrayList;

import org.omg.CORBA.PUBLIC_MEMBER;

import dto.Product;

public class ProductRepository {
	
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	
	public ProductRepository() {
		Product phone = new Product("P1234", "iPhone 6s", 800000);
		phone.setDescription("4.7-inch, 1334X750 Renina HD display,8-megapixel iSight Camera");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitsInStock(1000);
		phone.setCondition("New");
		
		Product notebook = new Product("P1235", "LG PC ±×·¥", 1500000);
		phone.setDescription("13.3-inch, IPS LED display, 5rd Generation Intel Core processors");
		phone.setCategory("Notebook");
		phone.setManufacturer("LG");
		phone.setUnitsInStock(1000);
		phone.setCondition("Refurbished");
		
		Product tablet = new Product("P1234", "iPhone 6s", 900000);
		phone.setDescription("212.8*125.6*6.6mm, Super AMOLED display, 0cta-Core processor");
		phone.setCategory("Tablet");
		phone.setManufacturer("Samsung");
		phone.setUnitsInStock(1000);
		phone.setCondition("tablet");
		
		listOfProducts.add(phone);
		listOfProducts.add(notebook);
		listOfProducts.add(tablet);
		
	}
	
	public ArrayList<Product> getAllProducts() {
		return listOfProducts;
	}
	
	public Product getProductById(String procudtId) {
		Product productById = null;
		
		for (int i = 0; i < listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			if (product != null && product.getProductId() != null && product.getProductId().equals(productById)){
				productById = product;
				break;
			}
		}
		return productById;
	}
}