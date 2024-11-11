package it.schoolboard.sbapi.repositories.anagrafiche;

import it.schoolboard.sbapi.models.anagrafiche.Luogo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LuogoRepository extends MongoRepository<Luogo, String> {

}
