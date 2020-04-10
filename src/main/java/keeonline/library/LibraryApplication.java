package keeonline.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryApplication {
    public static void main(String[] args) {
        System.setProperty("server.servlet.context-path", "/library");
        SpringApplication.run(LibraryApplication.class, args);
    }
}