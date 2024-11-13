package it.schoolboard.sbapi.repositories.generic;

import it.schoolboard.sbapi.models.generic.Circolare;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CircolareRepository extends MongoRepository<Circolare, String> {

}
