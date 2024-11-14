package it.schoolboard.sbapi.repositories.registro.assenze;

import it.schoolboard.sbapi.models.registro.assenze.DerogaAssenza;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DerogaAssenzaRepository extends MongoRepository<DerogaAssenza, String> {
}
