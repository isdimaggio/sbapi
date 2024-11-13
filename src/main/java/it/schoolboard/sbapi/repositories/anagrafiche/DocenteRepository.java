package it.schoolboard.sbapi.repositories.anagrafiche;

import it.schoolboard.sbapi.models.anagrafiche.Docente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DocenteRepository extends MongoRepository<Docente, String> {

}
