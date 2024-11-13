package it.schoolboard.sbapi.repositories.tabelle;

import it.schoolboard.sbapi.models.tabelle.OraValidaLezione;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OraValidaLezioneRepository extends MongoRepository<OraValidaLezione, String> {

}
