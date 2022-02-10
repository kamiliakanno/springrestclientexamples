package guru.springframwrork.springrestclientexamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"guru.springframwrork.api.domain"})
public class SpringrestclientexamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringrestclientexamplesApplication.class, args);
	}

}
