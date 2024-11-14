package it.schoolboard.sbapi.repositories.registro.disciplinari;

import it.schoolboard.sbapi.models.registro.disciplinari.NotaIndividuale;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotaIndividualeRepository extends MongoRepository<NotaIndividuale, String> {
}
