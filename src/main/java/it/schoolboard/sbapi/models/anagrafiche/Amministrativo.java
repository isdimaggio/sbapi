package it.schoolboard.sbapi.models.anagrafiche;

import it.schoolboard.sbapi.models.generic.AnnoScolastico;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "amministrativi")
public class Amministrativo {
    @Id
    private String id;
    @DBRef
    private AnnoScolastico annoScolastico;

    @DBRef
    private Utente utente;

    //TODO: @CreatedBy @LastModifiedBy per tracciare chi ha modificato

    @CreatedDate
    private LocalDateTime dataCreazione;

    @LastModifiedDate
    private LocalDateTime dataUltimaModifica;
}
