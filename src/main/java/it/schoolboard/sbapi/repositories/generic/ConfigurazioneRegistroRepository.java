package it.schoolboard.sbapi.repositories.generic;

import org.springframework.data.mongodb.repository.MongoRepository;
import it.schoolboard.sbapi.models.generic.ConfigurazioneRegistro;
public interface ConfigurazioneRegistroRepository extends MongoRepository<ConfigurazioneRegistro, String> {

}
