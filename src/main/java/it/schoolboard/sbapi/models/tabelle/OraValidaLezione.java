package it.schoolboard.sbapi.models.tabelle;

import it.schoolboard.sbapi.models.generic.AnnoScolastico;
import it.schoolboard.sbapi.utilities.GiornoSettimana;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@Document(collection = "oreValideLezioni")
public class OraValidaLezione {

    @Id
    private String id;
    @DBRef
    private AnnoScolastico annoScolastico;

    private int oraScolastica;
    private GiornoSettimana giornoSettimana;

    private LocalTime oraInizio;
    private LocalTime oraFine;

    //TODO: @CreatedBy @LastModifiedBy per tracciare chi ha modificato

    @CreatedDate
    private LocalDateTime dataCreazione;

    @LastModifiedDate
    private LocalDateTime dataUltimaModifica;
}
