package it.schoolboard.sbapi.models.generic;

import it.schoolboard.sbapi.utilities.RuoloUtente;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Document(collection = "avvisi")
public class Avviso {
    @Id
    private String id;
    @DBRef
    private AnnoScolastico annoScolastico;

    private LocalDate dataInizioPubblicazione;
    private LocalDate dataFinePubblicazione;

    private List<RuoloUtente> destinatari;

    private String oggetto;
    private String testo;

    //TODO: @CreatedBy @LastModifiedBy per tracciare chi ha modificato

    @CreatedDate
    private LocalDateTime dataCreazione;

    @LastModifiedDate
    private LocalDateTime dataUltimaModifica;
}
