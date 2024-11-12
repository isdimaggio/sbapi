package it.schoolboard.sbapi.models.tabelle;

import it.schoolboard.sbapi.models.anagrafiche.Docente;
import it.schoolboard.sbapi.models.anagrafiche.Studente;
import it.schoolboard.sbapi.models.generic.AnnoScolastico;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "classi")
public class Classe {

    @Id
    private String id;
    @DBRef
    private AnnoScolastico annoScolastico;

    private int anno;
    private String sezione;
    private String specializzazione;
    private int oreSettimanali;

    @DBRef
    private Docente docenteCoordinatore;

    @DBRef
    private Studente primoRappresentante;
    @DBRef
    private Studente secondoRappresentante;


    //TODO: @CreatedBy @LastModifiedBy per tracciare chi ha modificato

    @CreatedDate
    private LocalDateTime dataCreazione;

    @LastModifiedDate
    private LocalDateTime dataUltimaModifica;


}
