package it.schoolboard.sbapi.repositories.registro.assenze;

import it.schoolboard.sbapi.models.registro.assenze.Assenza;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AssenzaRepository extends MongoRepository<Assenza, String> {
}
