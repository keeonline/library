package keeonline.library.v1.model;


import keeonline.library.v1.dto.CatalogueItemDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Catalogue {
	private static Catalogue instance;

	private Map<Integer,CatalogueItem> items;

	private Catalogue() {
		super();
		items = new HashMap<>();
	}
	
	/**
	 * @return the instance
	 */
	public static synchronized Catalogue getInstance() {
		if (instance == null) {
			instance = new Catalogue();
		}
		return instance;
	}

	/**
	 * @return the CatalogueItemDtos
	 */
	public List<CatalogueItemDto> getCatalogueItemDtos() {
		List<CatalogueItemDto> dtos = new ArrayList<>();
		items.forEach((k,v) -> dtos.add(v.toDto()));
		return dtos;
	}

	public synchronized CatalogueItem add(CatalogueItem item) {
		items.put(Integer.valueOf(item.getId()),item);
		return item;
	}

	public synchronized CatalogueItem deleteById(int id) {
		Integer key = Integer.valueOf(id);
		CatalogueItem item = items.get(key);
		if (item != null) {
			items.remove(key);
		}
		return item;
	}

	public synchronized List<CatalogueItem> getCatalogueItemsByType(String type) {
		List<CatalogueItem> result = items.entrySet().stream()
				.filter(map -> map.getValue().typeMatches(type))
				.map(map -> map.getValue())
				.collect(Collectors.toList());
		return result;
	}

	public synchronized CatalogueItem getById(int id) {
		return items.get(Integer.valueOf(id));
	}
}

