package it.schoolboard.sbapi.repositories.generic;

import it.schoolboard.sbapi.models.generic.CensimentoAlunno;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CensimentoAlunnoRepository extends MongoRepository<CensimentoAlunno, String> {

}
