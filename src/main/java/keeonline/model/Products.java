package keeonline.model;

import java.util.ArrayList;
import java.util.List;

import keeonline.model.Product.ProductType;

public class Products {
	private static Products instance;
	
	private List<Product> products;
	
	private Products() {
		super();
		products = new ArrayList<>();
	}
	
	/**
	 * @return the instance
	 */
	public static synchronized Products getInstance() {
		if (instance == null) {
			instance = new Products();
		}
		return instance;
	}

	/**
	 * @return the products
	 */
	public List<Product> getProducts() {
		return products;
	}

	public synchronized Product add(Product product) {
		if (products == null) {
			products = new ArrayList<>();
		}
		products.add(product);
		return product;
	}

	public synchronized Product deleteById(int id) {
		for (Product p : products) {
			if (p.getProductId() == id) {
				products.remove(p);
				return p;
			}
		}
		return null;
	}

	public List<Product> getProductsByType(ProductType type) {
		List<Product> result = new ArrayList<>();
		
		if (products != null) {					
			for (Product p : products) {
				if (p.getProductType().equals(type.toString())) {
					result.add(p);
				}
			}						
		}
		
		return result;
	}

}
