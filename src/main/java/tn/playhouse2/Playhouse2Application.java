package tn.playhouse2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"tn.playhouse2"})
public class Playhouse2Application {

	public static void main(String[] args) {
		SpringApplication.run(Playhouse2Application.class, args);
	}

	
}
