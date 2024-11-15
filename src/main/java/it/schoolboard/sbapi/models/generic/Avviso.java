package it.schoolboard.sbapi.models.generic;

import it.schoolboard.sbapi.models.abstracts.AuditableEntity;
import it.schoolboard.sbapi.utilities.RuoloUtente;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Data
@Document(collection = "avvisi")
@EqualsAndHashCode(callSuper = false)
public class Avviso extends AuditableEntity {
    @Id
    private String id;
    @DBRef
    private AnnoScolastico annoScolastico;

    private LocalDate dataInizioPubblicazione;
    private LocalDate dataFinePubblicazione;

    private List<RuoloUtente> destinatari;

    private String oggetto;
    private String testo;
}
