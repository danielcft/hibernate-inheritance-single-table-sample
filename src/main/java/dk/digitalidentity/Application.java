package dk.digitalidentity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dk.digitalidentity.entities.Person;
import dk.digitalidentity.entities.TaxPayer;
import dk.digitalidentity.persistence.PersonRepository;

@SpringBootApplication
public class Application {
	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public CommandLineRunner demo(PersonRepository personRepository) {
		return (args) -> {
			Person person = new Person();
			person.setFirstName("John");
			person.setLastName("Doe");

			TaxPayer taxPayer = new TaxPayer();
			taxPayer.setFirstName("John");
			taxPayer.setLastName("Rockefeller");
			taxPayer.setTaxNumber(220022l);
			
			personRepository.save(person);
			personRepository.save(taxPayer);

			log.info("Persons found with findAll():");
			log.info("-------------------------------");
			for (Person p : personRepository.findAll()) {
				log.info(p.toString());
			}
			log.info("");
		};
	}
}
