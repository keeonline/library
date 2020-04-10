package keeonline.library.v1.model;


import java.util.ArrayList;
import java.util.List;

public class Inventory {
	private static Inventory instance;

	private List<InventoryItem> inventoryItems;

	private Inventory() {
		super();
		inventoryItems = new ArrayList<>();
	}

	public List<InventoryItem> getInventoryItems() {
		return inventoryItems;
	}

	/**
	 * @return the instance
	 */
	public static synchronized Inventory getInstance() {
		if (instance == null) {
			instance = new Inventory();
		}
		return instance;
	}

	public synchronized void add(List<InventoryItem> newItems) {
		if (inventoryItems == null) {
			inventoryItems = new ArrayList<>();
		}
		inventoryItems.addAll(newItems);
	}

	public synchronized InventoryItem deleteById(int id) {
		for (InventoryItem item : inventoryItems) {
			if (item.getId() == id) {
				inventoryItems.remove(item);

				return item;
			}
		}
		return null;
	}

}

