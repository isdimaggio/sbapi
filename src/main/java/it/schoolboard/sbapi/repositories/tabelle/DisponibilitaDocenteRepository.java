package it.schoolboard.sbapi.repositories.tabelle;

import it.schoolboard.sbapi.models.tabelle.DisponibilitaDocente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DisponibilitaDocenteRepository extends MongoRepository<DisponibilitaDocente, String> {

}
