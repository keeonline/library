package keeonline.library.v1.controllers;

import keeonline.library.v1.dto.InventoryDto;
import keeonline.library.v1.model.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/*
 * "C:\Program Files\Java\jdk1.8.0_212\bin\java" -jar target\library.jar
 * 
 * curl http://localhost:8080/library/v1/health/ping
 *
 * http://localhost:8080/library/swagger-ui.html#
*/

@RestController
@RequestMapping("/v1/inventory")
public class InventoryController {

    @GetMapping(path = "/")
    public List<InventoryItem> getInventory() {
        return Inventory.getInstance().getInventoryItems();
    }

    @PostMapping(path = "/")
    public List<InventoryItem> add(@RequestBody InventoryDto dto) {
        List<InventoryItem> newItems = new ArrayList<>();
        for (int i=0 ; i < dto.getCopies() ; i++) {
            newItems.add(new InventoryItem(dto.getCatalogueItemId()));
        }
        Inventory.getInstance().add(newItems);
        return newItems;
    }

}
