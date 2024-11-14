package it.schoolboard.sbapi.repositories.registro.assenze;

import it.schoolboard.sbapi.models.registro.assenze.PresenzaForzata;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PresenzaForzataRepository extends MongoRepository<PresenzaForzata, String> {

}
