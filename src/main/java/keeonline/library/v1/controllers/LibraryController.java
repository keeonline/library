package keeonline.library.v1.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.List;


/*
 * "C:\Program Files\Java\jdk-11.0.1\bin\java" -jar library-0.0.1-SNAPSHOT.jar
 * 
 * curl  http://localhost:8080/library/v1/ping
 * curl -X POST -H "Content-Type: application/json" -d "{\"title\":\"John With The Wind\",\"publicationId\": 11111,\"category\": \"Fiction\"}" http://localhost:8080/library/v1/books?copies=3
 * curl -X POST -H "Content-Type: application/json" -d "{\"title\":\"The Rise and Fall of the Gnomen Empire\",\"publicationId\": 22222,\"category\": \"Fiction\"}" http://localhost:8080/library/v1/books?copies=3
 * curl -X POST -H "Content-Type: application/json" -d "{\"title\":\"A Tale Of Two Mittens\",\"publicationId\": 33333,\"category\": \"Fiction\"}" http://localhost:8080/library/v1/books?copies=3
 * curl -X POST -H "Content-Type: application/json" -d "{\"title\":\"Waterloo\",\"publicationId\": 44444,\"category\": \"History\"}" http://localhost:8080/library/v1/books?copies=3
 * curl -X POST -H "Content-Type: application/json" -d "{\"title\":\"3:10 to Ongar\",\"genre\": \"Western\"}}" http://localhost:8080/library/v1/films?copies=2
 * curl -X POST -H "Content-Type: application/json" -d "{\"title\":\"The Shirt Locker\",\"genre\": \"Action\"}}" http://localhost:8080/library/v1/films?copies=4
 * curl -X POST -H "Content-Type: application/json" -d "{\"firstName\":\"Joe\",\"lastName\":\"Bloggs\",\"dob\": \"2011-12-03\",\"houseNumber\": 22,\"postCode\": \"AB1CD23\"}}" http://localhost:8080/library/v1/customers
 * curl http://localhost:8080/library/v1/books
 * curl http://localhost:8080/library/v1/films
 * curl http://localhost:8080/library/v1/products
 * 
 * curl -i http://localhost:8080/v2/api-docs
 * 
 * curl -i http://localhost:8080/swagger-ui.html
 */

@RestController
@RequestMapping("/library/v1/other")
public class LibraryController {
	
	public LibraryController(){
		super();
	}
	
    @GetMapping(path = "/hello")
    public String hello() {
        return "Hello";
    }

//    @GetMapping(path = "/catalogue")
//    public List<CatalogueItem> getCatalogueByType(@RequestParam("type") String type) {
//    	return Catalogue.getInstance().getCatalogueEntriesByType(type);
//    }

//    @PostMapping(path = "/books")
//    public void addBooks(@RequestParam int copies,@RequestBody Book book) {
//        for (int i=0 ; i<copies ; i++) {
//            Books.getInstance().addCopies(book);
//        }
//    }

//    @DeleteMapping("/books/{id}")
//    public Book retireBook(@PathVariable int id) {
//	    return Books.getInstance().deleteById(id);
//    }

//    @GetMapping(path = "/films")
//    public Films getFilms() {
//        return Films.getInstance();
//    }
//
//    @PostMapping(path = "/films")
//    public void addFilms(@RequestParam int copies,@RequestBody Film film) {
//        for (int i=0 ; i<copies ; i++) {
//            Films.getInstance().addCopies(film);
//        }
//    }
//
//    @DeleteMapping("/films/{id}")
//    public Film retireFilm(@PathVariable int id) {
//        return Films.getInstance().deleteById(id);
//    }

//    @GetMapping(path = "/customers")
//    public Customers getCustomers() {
//        return Customers.getInstance();
//    }
//
//    @PostMapping(path = "/customers")
//    public Customer addCustomer(@RequestBody Customer customer) {
//        return Customers.getInstance().add(customer);
//    }
//
//    @DeleteMapping("/customers/{id}")
//    public Customer deleteCustomer(@PathVariable int id) {
//        return Customers.getInstance().deleteById(id);
//    }
//
//    @GetMapping(path = "/loans")
//    public LoanList getAllLoans() {
//        return Loans.getInstance().getAllLoans();
//    }
//
//    @PostMapping(path = "/loans")
//    public Loan newLoan(@RequestBody Loan loan) {
//        return Loans.getInstance().newLoan(loan);
//    }
//
}
