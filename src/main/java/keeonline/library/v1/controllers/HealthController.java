package keeonline.library.v1.controllers;

import keeonline.library.v1.model.Pong;
import org.springframework.web.bind.annotation.*;


/*
 * "C:\Program Files\Java\jdk1.8.0_212\bin\java" -jar target\library.jar
 * 
 * curl http://localhost:8080/library/v1/health/ping
 *
 * http://localhost:8080/library/swagger-ui.html#
*/

@RestController
@RequestMapping("/v1/health")
public class HealthController {

    @GetMapping(path = "/ping")
    public Pong ping() {
        return new Pong();
    }

}
