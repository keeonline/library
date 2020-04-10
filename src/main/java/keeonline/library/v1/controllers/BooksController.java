package keeonline.library.v1.controllers;

import keeonline.library.v1.model.Book;
import keeonline.library.v1.model.Catalogue;
import keeonline.library.v1.model.CatalogueItem;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/*
 * "C:\Program Files\Java\jdk1.8.0_212\bin\java" -jar target\library.jar
 * 
 * curl http://localhost:8080/library/v1/health/ping
 *
 * http://localhost:8080/library/swagger-ui.html#
 */

@RestController
@RequestMapping("/v1/books")
public class BooksController {

    @GetMapping(path = "/")
    public List<CatalogueItem> getBooks() {
        return Catalogue.getInstance().getCatalogueItemsByType("book");
    }

    @PostMapping(path = "/")
    public Book add(@RequestBody Book book) {
        Catalogue.getInstance().add(book);
        return book;
    }

}
