package it.schoolboard.sbapi.repositories.anagrafiche;

import it.schoolboard.sbapi.models.anagrafiche.Alunno;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlunnoRepository extends MongoRepository<Alunno, String> {

}
