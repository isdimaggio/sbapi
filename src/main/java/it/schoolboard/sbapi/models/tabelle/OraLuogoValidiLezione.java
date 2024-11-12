package it.schoolboard.sbapi.models.tabelle;

import lombok.Data;

@Data
// no doc perchè embedded dentro 'Cattedra'
public class OraLuogoValidiLezione {

    private OraValidaLezione ora;
    private Aula luogo;

}
