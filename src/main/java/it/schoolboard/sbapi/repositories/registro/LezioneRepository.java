package it.schoolboard.sbapi.repositories.registro;

import it.schoolboard.sbapi.models.registro.Lezione;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LezioneRepository extends MongoRepository<Lezione, String> {
}
