package it.schoolboard.sbapi.repositories.registro.assenze;

import it.schoolboard.sbapi.models.registro.assenze.IngressoPosticipatoClasse;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IngressoPosticipatoClasseRepository extends MongoRepository<IngressoPosticipatoClasse, String> {
}
