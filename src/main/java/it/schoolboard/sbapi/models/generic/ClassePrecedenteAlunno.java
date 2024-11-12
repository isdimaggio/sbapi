package it.schoolboard.sbapi.models.generic;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import it.schoolboard.sbapi.models.tabelle.Classe;

import java.time.LocalDate;

@Data
// NOTA BENE: No @Document perchè viene fatto direttamente l'embed in 'Studente'
public class ClassePrecedenteAlunno {

    @DBRef
    private Classe classe;

    private LocalDate dataInizioDati;
    private LocalDate dataFineDati;

}
