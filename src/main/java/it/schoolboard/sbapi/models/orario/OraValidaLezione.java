package it.schoolboard.sbapi.models.orario;

import it.schoolboard.sbapi.models.abstracts.AuditableEntity;
import it.schoolboard.sbapi.models.generic.AnnoScolastico;
import it.schoolboard.sbapi.utilities.GiornoSettimana;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalTime;

@Data
@Document(collection = "oreValideLezioni")
@EqualsAndHashCode(callSuper = false)
public class OraValidaLezione extends AuditableEntity {
    @Id
    private String id;
    @DBRef
    private AnnoScolastico annoScolastico;

    private int oraScolastica;
    private GiornoSettimana giornoSettimana;

    private LocalTime oraInizio;
    private LocalTime oraFine;
}
