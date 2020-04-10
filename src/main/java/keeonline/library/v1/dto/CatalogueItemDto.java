package keeonline.library.v1.dto;

import keeonline.library.v1.model.CatalogueItem;

import java.util.Map;

public class CatalogueItemDto {
    private int id;
    private String type;
    private Map<String,Object> attributes;

    public CatalogueItemDto() {}

    public CatalogueItemDto(CatalogueItem item) {
        this.id = item.getId();
        this.type = item.getType();
        this.attributes = getAttributes();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }
}
