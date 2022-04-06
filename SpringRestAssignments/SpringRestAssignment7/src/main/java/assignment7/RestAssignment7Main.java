package assignment7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
public class RestAssignment7Main {

	public static void main(String[] args) {
		SpringApplication.run(RestAssignment7Main.class, args);
	}

}