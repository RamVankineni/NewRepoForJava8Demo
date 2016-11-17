
package SpringBootTestCase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)               // JUnit will invoke the class it references to run the tests in that class
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)   //@SpringBootTest can replaces number of annotations
@DirtiesContext                   //Test annotation which indicates that the ApplicationContext associated with a test is dirty and removed from the context cache.
public class HelloWorldConfigurationTests {      

    @LocalServerPort      //Tests that use @SpringBootTest can also inject the actual port into a field using the @LocalServerPort annotation.
    private int port;     // declaring a private integer. 

    @Autowired            //Marks a constructor, field, setter method or config method as to be autowired by Spring's dependency injection facilities.
    private TestRestTemplate restTemplate;   // declaring RestTemplate

    @Test                                    // Defining case
    public void testGreeting() throws Exception {     // declaring a public method.
        ResponseEntity<String> entity = restTemplate.getForEntity("http://localhost:" + this.port + "/", String.class); //// Assigning restTemplate to ResponseEntity
        assertEquals(HttpStatus.OK, entity.getStatusCode());  // assertEquals is a Junit test case.
    }

}
