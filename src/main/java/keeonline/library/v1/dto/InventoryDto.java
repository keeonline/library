package keeonline.library.v1.dto;

public class InventoryDto {
    private int catalogueItemId;
    private int copies;

    public InventoryDto() {
    }

    public void setCatalogueItemId(int catalogueItemId) {
        this.catalogueItemId = catalogueItemId;
    }

    public int getCatalogueItemId() {
        return catalogueItemId;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public int getCopies() {
        return copies;
    }
}
