package it.schoolboard.sbapi.services.def.anagrafiche;

import it.schoolboard.sbapi.models.anagrafiche.ComuneStato;
import it.schoolboard.sbapi.models.anagrafiche.Utente;

import java.util.List;

public interface ComuneStatoService {

    void creaComuneStato(ComuneStato c);
    void aggiornaComuneStato(ComuneStato c);
    void rimuoviComuneStato(String id);

    ComuneStato getComuneStatoById(String id);
    ComuneStato getComuneStatoByDenominazione(String denominazione);

    List<ComuneStato> getAllComuniStato();


}
