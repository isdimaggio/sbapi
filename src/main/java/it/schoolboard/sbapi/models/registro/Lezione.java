package it.schoolboard.sbapi.models.registro;

import it.schoolboard.sbapi.models.abstracts.AuditableEntity;
import it.schoolboard.sbapi.models.cattedre.Cattedra;
import it.schoolboard.sbapi.models.generic.AnnoScolastico;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document(collection = "lezioni")
@EqualsAndHashCode(callSuper = false)
public class Lezione extends AuditableEntity {
    @Id
    private String id;

    @DBRef
    private AnnoScolastico annoScolastico;

    private LocalDate data;
    private int oraScolasticaInizio;
    private int oraScolasticaFine;

    @DBRef
    private Cattedra cattedra;

    private String argomenti;
    private String attivita;


}
