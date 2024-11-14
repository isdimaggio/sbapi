package it.schoolboard.sbapi.models.cattedre;

import it.schoolboard.sbapi.models.abstracts.AuditableEntity;
import it.schoolboard.sbapi.models.anagrafiche.Docente;
import it.schoolboard.sbapi.models.generic.AnnoScolastico;
import it.schoolboard.sbapi.models.tabelle.Classe;
import it.schoolboard.sbapi.models.tabelle.Materia;
import it.schoolboard.sbapi.models.orario.OraLuogoValidiLezione;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "cattedre")
@EqualsAndHashCode(callSuper = false)
public class Cattedra extends AuditableEntity {
    @Id
    private String id;

    @DBRef
    private AnnoScolastico annoScolastico;

    @DBRef
    private Docente docente;

    @DBRef
    private Classe classe;

    @DBRef
    private Materia materia;

    private String colore;
    private List<OraLuogoValidiLezione> orario;

}
