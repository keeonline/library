package keeonline.library.v1.model;

import keeonline.library.v1.dto.CatalogueItemDto;

import java.util.Map;

public abstract class CatalogueItem {

	public static enum CatalogueEntryType {
		unknown,book,film;
	}
	
	private static int nextId = 0;
	
	private int id;
	private CatalogueEntryType type;

	public CatalogueItem() {
	}

	public CatalogueItem(CatalogueItemDto dto) {
		try {
			this.type = CatalogueEntryType.valueOf(dto.getType());
		}
		catch (IllegalArgumentException e) {
			this.type = CatalogueEntryType.unknown;
		}
		id = nextId++;
		setAttributesFromMap(dto.getAttributes());
	}

	public static void reset() {
		nextId = 0;
	}

	public int getId() {
		return id;
	}

	public String getType() {
		return type.toString();
	}

	public CatalogueItemDto toDto() {
		CatalogueItemDto dto = new CatalogueItemDto();
		dto.setId(this.getId());
		dto.setType(this.getType());
		dto.setAttributes(this.getAttributesAsMap());
		return dto;
	}

	public boolean typeMatches(String typeString) {
		try {
			CatalogueEntryType matchType = CatalogueEntryType.valueOf(typeString);
			return matchType.equals(this.type);
		}
		catch (IllegalArgumentException e) {
			return false;
		}
	}

	protected abstract void setAttributesFromMap(Map<String,Object> attributes);

	protected abstract Map<String,Object> getAttributesAsMap();

}
