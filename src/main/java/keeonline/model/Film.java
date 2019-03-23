package keeonline.model;

public final class Film extends Product {
	public enum FilmGenre {
		Action,Comedy,Drama,Horror,Musical,Western,Unknown;
	}
	
	private FilmGenre genre;

	public Film() {
		super("Film");
		setProductType("Film");
	}

	public Film(String title,String genre) {
		super("Film",title);
		this.setGenre(genre);
	}

	public String getGenre() {
		return genre.toString();
	}

	public void setGenre(String genre) {
		try {
			this.genre = FilmGenre.valueOf(genre);
		}
		catch (IllegalArgumentException e) {
			this.genre = FilmGenre.Unknown;
		}
	}

}
