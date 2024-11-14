package it.schoolboard.sbapi.models.tabelle;

import it.schoolboard.sbapi.models.abstracts.AuditableEntity;
import it.schoolboard.sbapi.models.anagrafiche.Docente;
import it.schoolboard.sbapi.models.anagrafiche.Studente;
import it.schoolboard.sbapi.models.generic.AnnoScolastico;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "classi")
@EqualsAndHashCode(callSuper = false)
public class Classe extends AuditableEntity {
    @Id
    private String id;
    @DBRef
    private AnnoScolastico annoScolastico;

    private int anno;
    private String sezione;
    private String specializzazione;
    private int oreSettimanali;

    @DBRef
    private Docente docenteCoordinatore;

    @DBRef
    private Studente primoRappresentante;
    @DBRef
    private Studente secondoRappresentante;
}
