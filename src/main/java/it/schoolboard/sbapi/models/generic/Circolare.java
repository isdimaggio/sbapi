package it.schoolboard.sbapi.models.generic;

import it.schoolboard.sbapi.models.abstracts.AuditableEntity;
import it.schoolboard.sbapi.utilities.RuoloUtente;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Data
@Document(collection = "circolari")
@EqualsAndHashCode(callSuper = false)
public class Circolare extends AuditableEntity {
    @Id
    private String id;

    @DBRef
    private AnnoScolastico annoScolastico;

    private String titolo;
    private ObjectId fileCircolare;
    private LocalDate dataPubblicazione;

    private List<DistribuzioneCircolare> listaDistribuzione;
    private List<RuoloUtente> overrideListaDistruzione;

    private boolean isPresaVisioneRichiesta;
    private boolean isAdesioneRichiesta;

}
