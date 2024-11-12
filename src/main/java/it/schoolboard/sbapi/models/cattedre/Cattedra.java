package it.schoolboard.sbapi.models.cattedre;

import it.schoolboard.sbapi.models.tabelle.Classe;
import it.schoolboard.sbapi.models.tabelle.Materia;
import it.schoolboard.sbapi.models.tabelle.OraLuogoValidiLezione;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

@Data
// NOTA BENE: No @Document perchè viene fatto direttamente l'embed in 'Docente'
public class Cattedra {

    @DBRef
    private Classe classe;

    @DBRef
    private Materia materia;

    private String colore;
    private List<OraLuogoValidiLezione> orario;

}
