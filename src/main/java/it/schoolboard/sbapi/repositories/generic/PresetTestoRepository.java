package it.schoolboard.sbapi.repositories.generic;

import it.schoolboard.sbapi.models.generic.PresetTesto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PresetTestoRepository extends MongoRepository<PresetTesto, String> {

}
