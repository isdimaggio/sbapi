package it.schoolboard.sbapi.models.tabelle;

import it.schoolboard.sbapi.models.abstracts.AuditableEntity;
import it.schoolboard.sbapi.models.generic.AnnoScolastico;
import it.schoolboard.sbapi.utilities.TipoValutazione;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "materie")
@EqualsAndHashCode(callSuper = false)
public class Materia extends AuditableEntity {

    @Id
    private String id;
    @DBRef
    private AnnoScolastico annoScolastico;

    private String nome;
    private String sigla;

    private List<TipoValutazione> tipiValutazioneConsentiti;

}
