package mak.arshad.DBWork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbWorkApplication {

	public static void main(String[] args) {

		Circketer c = new Circketer();
		c.getId();
		
		SpringApplication.run(DbWorkApplication.class, args);
	}

}
