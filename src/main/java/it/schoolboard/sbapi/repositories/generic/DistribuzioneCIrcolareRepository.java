package it.schoolboard.sbapi.repositories.generic;

import it.schoolboard.sbapi.models.generic.DistribuzioneCircolare;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DistribuzioneCIrcolareRepository extends MongoRepository<DistribuzioneCircolare, String> {

}
