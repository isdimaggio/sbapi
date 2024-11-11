package it.schoolboard.sbapi.services.def;

import it.schoolboard.sbapi.models.anagrafiche.Utente;

public interface UtenteService {
    void creaUtente(String nome, String cognome, String email, String password);

    Utente getUtente(String id);
}
