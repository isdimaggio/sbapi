package it.schoolboard.sbapi.repositories.generic;

import it.schoolboard.sbapi.models.generic.AnnoScolastico;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AnnoScolasticoRepository extends MongoRepository<AnnoScolastico, String> {

}
