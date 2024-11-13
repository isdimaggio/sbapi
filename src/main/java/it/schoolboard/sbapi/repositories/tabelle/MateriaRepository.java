package it.schoolboard.sbapi.repositories.tabelle;

import it.schoolboard.sbapi.models.tabelle.Materia;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MateriaRepository extends MongoRepository<Materia, String> {

}
