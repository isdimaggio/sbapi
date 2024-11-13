package it.schoolboard.sbapi.repositories.tabelle;

import it.schoolboard.sbapi.models.tabelle.Festivita;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FestivitaRepository extends MongoRepository<Festivita, String> {

}
