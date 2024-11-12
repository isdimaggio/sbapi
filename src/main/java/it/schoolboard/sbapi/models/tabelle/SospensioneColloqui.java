package it.schoolboard.sbapi.models.tabelle;

import it.schoolboard.sbapi.models.generic.AnnoScolastico;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Document(collection = "sospensioniColloqui")
public class SospensioneColloqui {

    @Id
    private String id;
    @DBRef
    private AnnoScolastico annoScolastico;

    private String motivazione;
    private LocalDate dataInizio;
    private LocalDate dataFine;

    //TODO: @CreatedBy @LastModifiedBy per tracciare chi ha modificato

    @CreatedDate
    private LocalDateTime dataCreazione;

    @LastModifiedDate
    private LocalDateTime dataUltimaModifica;

}
