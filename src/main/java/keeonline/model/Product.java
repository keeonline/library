package keeonline.model;

import java.util.Objects;

public abstract class Product {

	private static int nextId = 0;
	
	public enum ProductType {
		Book,Film,Unknown;
	}

	private int productId;
	private ProductType type;
	private String title;

	protected Product() {}

	public Product(String type,String title) {
		this(type);
		this.title = title;
	}
	
	public Product(String type) {
		super();
		this.setProductType(type);
		productId = nextId++;
	}

	public static void reset() {
		nextId = 0;
	}

	public int getProductId() {
		return productId;
	}

	public String getProductType() {
		return type.toString();
	}

	public void setProductType(String type) {
		try {
			this.type = ProductType.valueOf(type);
		}
		catch (IllegalArgumentException e) {
			this.type = ProductType.Unknown;
		}
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Product product = (Product) o;
		return productId == product.productId &&
				type == product.type &&
				Objects.equals(title, product.title);
	}

	@Override
	public int hashCode() {
		return Objects.hash(productId, type, title);
	}
}
