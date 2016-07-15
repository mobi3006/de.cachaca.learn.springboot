package de.cachaca.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.MediaType;


@SpringBootApplication
@RestController
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
	
    @RequestMapping(
    		value = "/user", 
    		method = RequestMethod.GET,
            produces = { MediaType.APPLICATION_JSON_VALUE })
    public String getUsername() {
    	return "pierre";
    };
	
}
