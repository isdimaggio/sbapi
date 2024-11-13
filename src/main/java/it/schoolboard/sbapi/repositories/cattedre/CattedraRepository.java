package it.schoolboard.sbapi.repositories.cattedre;

import it.schoolboard.sbapi.models.cattedre.Cattedra;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CattedraRepository extends MongoRepository<Cattedra, String> {
}
