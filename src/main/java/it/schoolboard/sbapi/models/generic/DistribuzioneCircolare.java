package it.schoolboard.sbapi.models.generic;

import it.schoolboard.sbapi.models.anagrafiche.Utente;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data
// embedded in "circolare"
public class DistribuzioneCircolare {

    @DBRef
    private Utente utente;

    private boolean isVisualizzato;
    private boolean isPresaVisione;
    private boolean isAdesione;

}
