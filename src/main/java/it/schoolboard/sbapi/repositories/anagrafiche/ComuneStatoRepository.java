package it.schoolboard.sbapi.repositories.anagrafiche;

import it.schoolboard.sbapi.models.anagrafiche.ComuneStato;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LuogoRepository extends MongoRepository<ComuneStato, String> {

}
