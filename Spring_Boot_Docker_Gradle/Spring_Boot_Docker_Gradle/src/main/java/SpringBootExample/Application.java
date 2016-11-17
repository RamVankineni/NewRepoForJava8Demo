package SpringBootExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication                   // defining application as Spring Boot Application
@RestController                          // configuring RequestMappingHandlerMapping-RequestMappingHandlerAdapter pair 
public class Application {               // creating the class 

    @RequestMapping("/")                 // This annotation for mapping web requests 
    public String home() {               // creating the home method to return the message.
        return "This coming from the Docker. Ports are exposed in good way";
    }

    public static void main(String[] args) {    // main method declaration
        SpringApplication.run(Application.class, args); // creating  SpringApplication instance before running.
    }

}
