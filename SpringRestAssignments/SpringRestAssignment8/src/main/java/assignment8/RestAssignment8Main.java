package assignment8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
public class RestAssignment8Main {

	public static void main(String[] args) {
		SpringApplication.run(RestAssignment8Main.class, args);
	}

}