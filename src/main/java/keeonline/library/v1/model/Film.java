package keeonline.library.v1.model;

import keeonline.library.v1.dto.CatalogueItemDto;

import java.util.HashMap;
import java.util.Map;

public final class Film extends CatalogueItem {
	public enum FilmGenre {
		unknown,action,comedy,drama,horror,musical,western;
	}

	private String title;
	private String director;
	private FilmGenre genre;

	public Film(CatalogueItemDto dto) {
		super(dto);
	}

	@Override
	protected void setAttributesFromMap(Map<String, Object> attributes) {
		title = (String)attributes.get("title");
		director = (String)attributes.get("director");
		genre = Film.FilmGenre.valueOf((String)attributes.get("genre"));
	}

	@Override
	public Map<String,Object> getAttributesAsMap() {
		Map<String,Object> attributes = new HashMap<>();
		attributes.put("title",getTitle());
		attributes.put("director",getDirector());
		attributes.put("genre",getGenre());
		return attributes;
	}

	public String getTitle() {
		return title;
	}

	public String getDirector() {
		return director;
	}

	public String getGenre() {
		return genre.toString();
	}

}
