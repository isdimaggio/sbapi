package it.schoolboard.sbapi.models.registro.assenze;

import it.schoolboard.sbapi.models.abstracts.AuditableEntity;
import it.schoolboard.sbapi.models.anagrafiche.Docente;
import it.schoolboard.sbapi.models.anagrafiche.Studente;
import it.schoolboard.sbapi.models.generic.AnnoScolastico;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Document(collection = "usciteAnticipate")
@EqualsAndHashCode(callSuper = false)
public class UscitaAnticipata extends AuditableEntity {

    @Id
    private String id;

    @DBRef
    private Studente studente;

    @DBRef
    private AnnoScolastico annoScolastico;

    @DBRef
    private Docente docenteAutorizzante;

    private LocalDateTime dataOraUscita;

    private String motivazione;

}
