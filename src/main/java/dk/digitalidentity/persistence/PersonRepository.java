package dk.digitalidentity.persistence;

import org.springframework.data.repository.CrudRepository;

import dk.digitalidentity.entities.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

}
