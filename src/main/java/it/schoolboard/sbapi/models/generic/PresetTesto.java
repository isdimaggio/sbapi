package it.schoolboard.sbapi.models.generic;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "presetTesti")
/*
 Vengono inseriti all'installazione del registro con dei valori di default,
 possono essere poi modificati ma NON inseriti NE eliminati dall'admin.
 */
public class PresetTesto {
    @Id
    private String id;
    private String valore;
    private String descrizione;

    //TODO: @LastModifiedBy per tracciare chi ha modificato

    @LastModifiedDate
    private LocalDateTime dataUltimaModifica;
}
