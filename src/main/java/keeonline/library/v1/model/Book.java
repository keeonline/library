package keeonline.library.v1.model;

import keeonline.library.v1.dto.CatalogueItemDto;

import java.util.HashMap;
import java.util.Map;

public final class Book extends CatalogueItem {
	public enum BookGenre {
		unknown,biography,fiction,history,travel,reference;
	}

	private Integer isbn;
	private String title;
	private String author;
	private BookGenre genre;

	public Book(CatalogueItemDto dto) {
		super(dto);
	}

	@Override
	protected void setAttributesFromMap(Map<String, Object> attributes) {
		title = (String)attributes.get("title");
		author = (String)attributes.get("author");
		genre = BookGenre.valueOf((String)attributes.get("genre"));
		isbn = (Integer)attributes.get("isbn");
	}

	@Override
	public Map<String,Object> getAttributesAsMap() {
		Map<String,Object> attributes = new HashMap<>();
		attributes.put("title",getTitle());
		attributes.put("author",getAuthor());
		attributes.put("genre",getGenre());
		attributes.put("isbn",getIsbn());
		return attributes;
	}

	public String getGenre() {
		return genre.toString();
	}

	public Integer getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
}
