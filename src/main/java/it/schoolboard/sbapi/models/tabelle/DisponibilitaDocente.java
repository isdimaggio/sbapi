package it.schoolboard.sbapi.models.tabelle;

import it.schoolboard.sbapi.models.orario.OraValidaLezione;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data
// NOTA BENE: No @Document perchè viene fatto direttamente l'embed in 'Docente'
public class DisponibilitaDocente {

    @DBRef
    private OraValidaLezione oraValidaLezione;
    private String annotazione;

}
