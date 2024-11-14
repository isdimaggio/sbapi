package it.schoolboard.sbapi.repositories.generic;

import it.schoolboard.sbapi.models.generic.DataNumeroOre;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DataNumeroOreRepository extends MongoRepository<DataNumeroOre, String> {
}
