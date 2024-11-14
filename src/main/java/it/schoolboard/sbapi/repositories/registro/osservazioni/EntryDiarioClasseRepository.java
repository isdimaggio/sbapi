package it.schoolboard.sbapi.repositories.registro.osservazioni;

import it.schoolboard.sbapi.models.registro.osservazioni.EntryDiarioClasse;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EntryDiarioClasseRepository extends MongoRepository<EntryDiarioClasse, String> {
}
