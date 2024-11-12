package it.schoolboard.sbapi.models.tabelle;

import it.schoolboard.sbapi.models.abstracts.AuditableEntity;
import it.schoolboard.sbapi.models.generic.AnnoScolastico;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document(collection = "sospensioniColloqui")
@EqualsAndHashCode(callSuper = false)
public class SospensioneColloqui extends AuditableEntity {

    @Id
    private String id;
    @DBRef
    private AnnoScolastico annoScolastico;

    private String motivazione;
    private LocalDate dataInizio;
    private LocalDate dataFine;

}
