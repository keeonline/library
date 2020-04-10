package keeonline.library.v1.model;

public class InventoryItem {

	public static enum InventoryItemState {
		available,loaned;
	}

	private static int nextId = 0;

	private int id;
	private InventoryItemState state;
	private CatalogueItem catalogueItem;

	public InventoryItem(int catalogueItemId) {
		id = nextId++;
		state = InventoryItemState.available;
		catalogueItem = Catalogue.getInstance().getById(catalogueItemId);
	}

	public static void reset() {
		nextId = 0;
	}

	public int getId() {
		return id;
	}

	public String getState() {
		return state.toString();
	}

	public CatalogueItem getCatalogueItem() {
		return catalogueItem;
	}

}
