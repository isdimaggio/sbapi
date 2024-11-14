package it.schoolboard.sbapi.models.anagrafiche;

import it.schoolboard.sbapi.models.abstracts.AuditableEditsEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "comuni_stati")
@EqualsAndHashCode(callSuper = false)
public class ComuneStato extends AuditableEditsEntity {

    @Id
    private String id;

    //TODO: scegliere uno unique?
    private String denominazione;
    private int codiceIstat;
    private String codiceCatastale;
    private boolean isStatoEstero;

}
