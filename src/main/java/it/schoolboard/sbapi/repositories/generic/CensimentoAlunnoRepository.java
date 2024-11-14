package it.schoolboard.sbapi.repositories.generic;

import it.schoolboard.sbapi.models.generic.CensimentoStudente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CensimentoAlunnoRepository extends MongoRepository<CensimentoStudente, String> {

}
