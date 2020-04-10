package keeonline.library.v1.controllers;

import keeonline.library.v1.dto.CatalogueItemDto;
import keeonline.library.v1.model.Catalogue;
import keeonline.library.v1.model.CatalogueItem;

import keeonline.library.v1.model.CatalogueItemFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/*
 * "C:\Program Files\Java\jdk1.8.0_212\bin\java" -jar target\library.jar
 *
 * curl -X POST -H "Content-Type: application/json" -d "{\"type\":\"book\",\"attributes\": { isbn: 11111,\"genre\": \"Fiction\"}" http://localhost:8080/library/v1/catalogue
 * 
 * curl http://localhost:8080/library/v1/health/ping
 *
 * http://localhost:8080/library/swagger-ui.html#
 */

@RestController
@RequestMapping("/v1/catalogue")
public class CatalogueController {

    @GetMapping(path = "")
    public List<CatalogueItemDto> getList() {
        return Catalogue.getInstance().getCatalogueItemDtos();
    }

    @GetMapping(path = "{id}")
    public CatalogueItemDto getById(@PathVariable int id) {
        CatalogueItem item = Catalogue.getInstance().getById(id);
        if (item == null){
            return null;
        }
        else {
            return item.toDto();
        }
    }

    @DeleteMapping(path = "{id}")
    public CatalogueItemDto deleteById(@PathVariable int id) {
        CatalogueItem item = Catalogue.getInstance().deleteById(id);
        if (item == null){
            return null;
        }
        else {
            return item.toDto();
        }
    }

    @PostMapping(path = "")
    public CatalogueItemDto add(@RequestBody CatalogueItemDto dto) {
        CatalogueItem item = CatalogueItemFactory.getItem(dto);
        Catalogue.getInstance().add(item);
        return item.toDto();
    }

}
