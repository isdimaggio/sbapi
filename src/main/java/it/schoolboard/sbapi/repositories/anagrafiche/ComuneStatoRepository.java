package it.schoolboard.sbapi.repositories.anagrafiche;

import it.schoolboard.sbapi.models.anagrafiche.ComuneStato;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ComuneStatoRepository extends MongoRepository<ComuneStato, String> {
    Optional<ComuneStato> findByCodiceCatastale(String codiceCatastale);
    Optional<ComuneStato> findByDenominazione(String denominazione);
}
