package keeonline.model;

import java.util.ArrayList;
import java.util.List;

import keeonline.model.Product.ProductType;

public class Films {
	private static Films instance;
	
	private List<Film> films;
	
	private Films() {
		super();
		films = new ArrayList<>();
	}
	
	/**
	 * @return the instance
	 */
	public static synchronized Films getInstance() {
		if (instance == null) {
			instance = new Films();
		}
		return instance;
	}

	public List<Film> getFilms() {
		return films;
	}

	public synchronized Film addCopies(Film film) {
		//TODO: validate film
		Products.getInstance().add(new Film(film.getTitle(),film.getGenre()));
		loadFilms();
		return film;
	}

	public synchronized Film remove(Film film) {
		if (films != null) {
			films.remove(film);
		}
		return film;
	}

	private void loadFilms() {
		List<Product> products = Products.getInstance().getProductsByType(ProductType.Film);
		films = new ArrayList<>();
		for (Product product : products) {
			films.add((Film)product);
		}
	}

	public Film deleteById(int id) {
		Product p = Products.getInstance().deleteById(id);
		loadFilms();
		return (Film)p;
	}
}
