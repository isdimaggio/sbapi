package it.schoolboard.sbapi.models.cattedre;

import it.schoolboard.sbapi.models.anagrafiche.Alunno;
import it.schoolboard.sbapi.models.tabelle.Materia;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data
// NOTA BENE: No @Document perchè viene fatto direttamente l'embed in 'Studente'
public class CattedraSostegno {

    @DBRef
    private Alunno alunno;

    @DBRef
    private Materia materia;

}
