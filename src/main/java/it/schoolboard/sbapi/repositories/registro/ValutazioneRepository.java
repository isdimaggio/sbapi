package it.schoolboard.sbapi.repositories.registro;

import it.schoolboard.sbapi.models.registro.Valutazione;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ValutazioneRepository extends MongoRepository<Valutazione, String> {
}
