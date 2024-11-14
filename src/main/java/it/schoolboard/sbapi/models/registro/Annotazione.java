package it.schoolboard.sbapi.models.registro;

import it.schoolboard.sbapi.models.abstracts.AuditableEntity;
import it.schoolboard.sbapi.models.anagrafiche.Docente;
import it.schoolboard.sbapi.models.generic.AnnoScolastico;
import it.schoolboard.sbapi.models.tabelle.Classe;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document(collection = "annotazioni")
@EqualsAndHashCode(callSuper = false)
public class Annotazione extends AuditableEntity {
    @Id
    private String id;

    @DBRef
    private AnnoScolastico annoScolastico;

    @DBRef
    private Docente docente;

    @DBRef
    private Classe classe;

    private LocalDate data;
    private String testo;
    private boolean isCompito;
    private boolean visibileGenitori;
    private boolean visibileAlunni;
}
