package it.schoolboard.sbapi.repositories.anagrafiche;

import it.schoolboard.sbapi.models.anagrafiche.Utente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UtenteRepository extends MongoRepository<Utente, String> {

}
