package it.schoolboard.sbapi.models.tabelle;

import it.schoolboard.sbapi.models.abstracts.AuditableEntity;
import it.schoolboard.sbapi.models.generic.AnnoScolastico;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "aule")
@EqualsAndHashCode(callSuper = false)
public class Aula extends AuditableEntity {
    @Id
    private String id;

    @DBRef
    private AnnoScolastico annoScolastico;

    private String nome;
    private int capienza;

}
