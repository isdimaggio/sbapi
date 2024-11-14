package it.schoolboard.sbapi.models.anagrafiche;

import it.schoolboard.sbapi.models.abstracts.AuditableEntity;
import it.schoolboard.sbapi.models.generic.AnnoScolastico;
import it.schoolboard.sbapi.models.tabelle.DisponibilitaDocente;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "docenti")
@EqualsAndHashCode(callSuper = false)
public class Docente extends AuditableEntity {
    @Id
    private String id;

    @DBRef
    private AnnoScolastico annoScolastico;

    @DBRef
    private Utente utente;

    private boolean isStaff;
    private boolean isSostegno;

    private List<DisponibilitaDocente> disponibilita;

}
