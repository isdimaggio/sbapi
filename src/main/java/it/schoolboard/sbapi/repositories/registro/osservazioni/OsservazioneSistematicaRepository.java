package it.schoolboard.sbapi.repositories.registro.osservazioni;

import it.schoolboard.sbapi.models.registro.osservazioni.OsservazioneSistematica;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OsservazioneSistematicaRepository extends MongoRepository<OsservazioneSistematica, String> {
}
