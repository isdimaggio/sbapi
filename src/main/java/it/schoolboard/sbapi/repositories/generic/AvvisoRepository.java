package it.schoolboard.sbapi.repositories.generic;

import it.schoolboard.sbapi.models.generic.Avviso;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AvvisoRepository extends MongoRepository<Avviso, String> {

}
