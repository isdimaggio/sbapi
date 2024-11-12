package it.schoolboard.sbapi.models.generic;

import it.schoolboard.sbapi.models.abstracts.AuditableEditsEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "presetTesti")
@EqualsAndHashCode(callSuper = false)
/*
 Vengono inseriti all'installazione del registro con dei valori di default,
 possono essere poi modificati ma NON inseriti NE eliminati dall'admin.
 */
public class PresetTesto extends AuditableEditsEntity {
    @Id
    private String id;
    private String valore;
    private String descrizione;
}
