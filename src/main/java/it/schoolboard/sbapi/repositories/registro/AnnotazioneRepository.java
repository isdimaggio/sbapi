package it.schoolboard.sbapi.repositories.registro;

import it.schoolboard.sbapi.models.registro.Annotazione;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AnnotazioneRepository extends MongoRepository<Annotazione, String> {

}
