package it.schoolboard.sbapi.models.generic;

import it.schoolboard.sbapi.models.anagrafiche.Utente;
import it.schoolboard.sbapi.utilities.TipoAssociazioneTutore;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data
// NOTA BENE: No @Document perchè viene fatto direttamente l'embed in 'Studente'
public class AssociazioneTutore {

    @DBRef
    private Utente utente;
    private TipoAssociazioneTutore tipoAssociazione;

}
