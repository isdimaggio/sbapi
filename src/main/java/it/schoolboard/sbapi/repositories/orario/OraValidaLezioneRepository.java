package it.schoolboard.sbapi.repositories.orario;

import it.schoolboard.sbapi.models.orario.OraValidaLezione;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OraValidaLezioneRepository extends MongoRepository<OraValidaLezione, String> {

}
