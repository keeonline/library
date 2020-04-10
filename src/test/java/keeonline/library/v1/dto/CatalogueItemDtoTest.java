package keeonline.library.v1.dto;

import keeonline.library.v1.model.CatalogueItem;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import static org.junit.Assert.*;

public class CatalogueItemDtoTest {

    @Test
    public void setGetId() {
        CatalogueItemDto dto = new CatalogueItemDto();
        dto.setId(99);
        assertEquals(99,dto.getId());
    }

    @Test
    public void setGetType() {
        CatalogueItemDto dto = new CatalogueItemDto();
        dto.setType("rubbish");
        assertEquals("rubbish",dto.getType());
    }

    @Test
    public void setGetAttributes() {
        CatalogueItemDto dto = new CatalogueItemDto();
        dto.setAttributes(makeAttributes(5));
        assertNotNull(dto.getAttributes());
        assertEquals("one",dto.getAttributes().get("1"));
        assertEquals("two",dto.getAttributes().get("2"));
        assertEquals("three",dto.getAttributes().get("3"));
        assertEquals("four",dto.getAttributes().get("4"));
        assertEquals("five",dto.getAttributes().get("5"));
    }

    private Map<String,Object> makeAttributes(int entries){
        Map<String,Object> attributes = new HashMap<>();
        String [] values = {"one","two","three","four","five","six","seven","eight","nine","ten"};
        for (int i=0 ; ((i < entries) && (i < values.length)) ; i++){
            attributes.put(Integer.valueOf(i+1).toString(),values[i]);
        }
        return attributes;
    }
}