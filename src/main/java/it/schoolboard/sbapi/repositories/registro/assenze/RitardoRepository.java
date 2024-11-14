package it.schoolboard.sbapi.repositories.registro.assenze;

import it.schoolboard.sbapi.models.registro.assenze.Ritardo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RitardoRepository extends MongoRepository<Ritardo, String> {
}
