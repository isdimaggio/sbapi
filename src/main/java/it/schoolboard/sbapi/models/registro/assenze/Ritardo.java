package it.schoolboard.sbapi.models.registro.assenze;

import it.schoolboard.sbapi.models.abstracts.AuditableEntity;
import it.schoolboard.sbapi.models.anagrafiche.Alunno;
import it.schoolboard.sbapi.models.anagrafiche.Docente;
import it.schoolboard.sbapi.models.generic.AnnoScolastico;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Document(collection = "ritardi")
@EqualsAndHashCode(callSuper = false)
public class Ritardo extends AuditableEntity {

    @Id
    private String id;

    @DBRef
    private AnnoScolastico annoScolastico;

    @DBRef
    private Alunno alunno;
    private LocalTime oraEntrata;

    private LocalDate data;
    private boolean isGiustificata;
    private boolean isGiustificataDaGenitore;
    private boolean ricevutaAmmonizione; // giustifica in ritardo
    private String motivoGiustificazione;
    private LocalDate dataGiustificazione;

    @DBRef
    private Docente docenteGiustificatore;


}
