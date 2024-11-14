package it.schoolboard.sbapi.models.cattedre;

import it.schoolboard.sbapi.models.abstracts.AuditableEntity;
import it.schoolboard.sbapi.models.anagrafiche.Studente;
import it.schoolboard.sbapi.models.anagrafiche.Docente;
import it.schoolboard.sbapi.models.generic.AnnoScolastico;
import it.schoolboard.sbapi.models.tabelle.Materia;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "cattedreSostegno")
@EqualsAndHashCode(callSuper = false)
public class CattedraSostegno extends AuditableEntity {

    @Id
    private String id;

    @DBRef
    private AnnoScolastico annoScolastico;

    @DBRef
    private Docente docente;

    @DBRef
    private Studente studente;

    @DBRef
    private Materia materia;

}
