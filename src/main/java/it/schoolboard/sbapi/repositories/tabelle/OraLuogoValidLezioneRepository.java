package it.schoolboard.sbapi.repositories.tabelle;

import it.schoolboard.sbapi.models.tabelle.OraLuogoValidiLezione;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OraLuogoValidLezioneRepository extends MongoRepository<OraLuogoValidiLezione, String> {

}
