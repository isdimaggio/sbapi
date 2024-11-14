package it.schoolboard.sbapi.repositories.registro;

import it.schoolboard.sbapi.models.registro.Supplenza;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SupplenzaRepository extends MongoRepository<Supplenza, String> {
}
