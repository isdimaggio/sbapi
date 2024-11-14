package it.schoolboard.sbapi.models.orario;

import it.schoolboard.sbapi.models.tabelle.Aula;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data
// no doc perchè embedded dentro 'Cattedra'
public class OraLuogoValidiLezione {

    @DBRef
    private OraValidaLezione ora;

    @DBRef
    private Aula aula;

}
