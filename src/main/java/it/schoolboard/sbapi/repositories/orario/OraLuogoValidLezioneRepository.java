package it.schoolboard.sbapi.repositories.orario;

import it.schoolboard.sbapi.models.orario.OraLuogoValidiLezione;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OraLuogoValidLezioneRepository extends MongoRepository<OraLuogoValidiLezione, String> {

}
