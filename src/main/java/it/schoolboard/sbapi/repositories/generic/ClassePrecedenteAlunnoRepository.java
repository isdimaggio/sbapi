package it.schoolboard.sbapi.repositories.generic;

import it.schoolboard.sbapi.models.generic.ClassePrecedenteAlunno;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClassePrecedenteAlunnoRepository extends MongoRepository<ClassePrecedenteAlunno, String> {

}
