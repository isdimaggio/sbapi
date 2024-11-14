package it.schoolboard.sbapi.repositories.anagrafiche;

import it.schoolboard.sbapi.models.anagrafiche.Utente;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UtenteRepository extends MongoRepository<Utente, String> {

    Optional<Utente> findByUsername(String username);
    Optional<Utente> findByUsernameAndPassword(String username, String password);
    Optional<Utente> findByCodiceFiscale(String email);

}
