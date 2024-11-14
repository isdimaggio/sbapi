package it.schoolboard.sbapi.models.registro;

import it.schoolboard.sbapi.models.abstracts.AuditableEntity;
import it.schoolboard.sbapi.models.anagrafiche.Studente;
import it.schoolboard.sbapi.models.generic.AnnoScolastico;
import it.schoolboard.sbapi.utilities.TipoValutazione;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "valutazioni")
@EqualsAndHashCode(callSuper = false)
public class Valutazione extends AuditableEntity {
    @Id
    private String id;

    @DBRef
    private AnnoScolastico annoScolastico;

    @DBRef
    private Lezione lezione;

    @DBRef
    private Studente studente;

    private TipoValutazione tipoValutazione;

    private double valore;
    private String giudizio;

}
