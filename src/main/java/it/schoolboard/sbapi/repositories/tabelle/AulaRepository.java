package it.schoolboard.sbapi.repositories.tabelle;

import it.schoolboard.sbapi.models.tabelle.Aula;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AulaRepository extends MongoRepository<Aula, String> {

}
