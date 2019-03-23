package keeonline.model;

import java.util.ArrayList;
import java.util.List;

import keeonline.model.Product.ProductType;

public class Books {
	private static Books instance;
	
	private List<Book> books;
	
	private Books() {
		super();
		books = new ArrayList<>();
	}
	
	public static synchronized Books getInstance() {
		if (instance == null) {
			instance = new Books();
		}
		return instance;
	}
	
	public List<Book> getBooks() {
		return books;
	}

	public synchronized Book addCopies(Book book) {
		//TODO: validate book
		Products.getInstance().add(new Book(book.getTitle(),book.getPublicationId(),book.getCategory()));
		loadBooks();
		return book;
	}

	private void loadBooks() {
		List<Product> products = Products.getInstance().getProductsByType(ProductType.Book);
		books = new ArrayList<>();
		for (Product product : products) {
			books.add((Book)product);
		}
	}

	public Book deleteById(int id) {
		Product p = Products.getInstance().deleteById(id);
		loadBooks();
		return (Book)p;
	}
}
