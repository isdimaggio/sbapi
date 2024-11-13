package it.schoolboard.sbapi.repositories.generic;

import it.schoolboard.sbapi.models.generic.AssociazioneTutore;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AssociazioneTutoreRepository extends MongoRepository<AssociazioneTutore, String> {

}
