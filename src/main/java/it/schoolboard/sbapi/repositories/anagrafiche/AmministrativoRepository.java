package it.schoolboard.sbapi.repositories.anagrafiche;

import it.schoolboard.sbapi.models.anagrafiche.Amministrativo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AmministrativoRepository extends MongoRepository<Amministrativo, String> {

}
