package keeonline.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import keeonline.model.Product.ProductType;

public class ProductTypeTest {
	
	@Test
	public void toStringBook() throws Exception {
		assertEquals("Book",ProductType.Book.toString());
	}

	@Test
	public void toStringFilm() throws Exception {
		assertEquals("Film",ProductType.Film.toString());
	}

}
