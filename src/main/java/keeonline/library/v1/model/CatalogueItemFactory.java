package keeonline.library.v1.model;

import keeonline.library.v1.dto.CatalogueItemDto;

public class CatalogueItemFactory {
    public static CatalogueItem getItem(CatalogueItemDto dto) {
        if (dto.getType().equals("book")){
            return new Book(dto);
        }
        if (dto.getType().equals("film")){
            return new Film(dto);
        }
        return null;
    }
}
