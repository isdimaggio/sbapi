package it.schoolboard.sbapi.models.registro.assenze;

import it.schoolboard.sbapi.models.abstracts.AuditableEntity;
import it.schoolboard.sbapi.models.anagrafiche.Docente;
import it.schoolboard.sbapi.models.generic.AnnoScolastico;
import it.schoolboard.sbapi.models.tabelle.Classe;
import it.schoolboard.sbapi.utilities.OrarioScolastico;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "usciteAnticipateClasse")
@EqualsAndHashCode(callSuper = false)
public class UscitaAnticipataClasse extends AuditableEntity {

    @Id
    private String id;

    @DBRef
    private AnnoScolastico annoScolastico;

    @DBRef
    private Classe classe;

    @DBRef
    private Docente docenteAutorizzante;

    //TODO: per ora gestito con un semplice enum, da rivedere
    private OrarioScolastico orarioScolastico;

}
