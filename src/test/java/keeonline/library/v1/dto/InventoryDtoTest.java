package keeonline.library.v1.dto;

import org.junit.Test;

import static org.junit.Assert.*;

public class InventoryDtoTest {

    @Test
    public void getCatalogueItemId() {
        InventoryDto dto = new InventoryDto();
        dto.setCatalogueItemId(123);
        assertEquals(123,dto.getCatalogueItemId());
    }

    @Test
    public void getCopies() {
        InventoryDto dto = new InventoryDto();
        dto.setCopies(99);
        assertEquals(99,dto.getCopies());
    }
}