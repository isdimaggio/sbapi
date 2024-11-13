package it.schoolboard.sbapi.services.def.anagrafiche;

import it.schoolboard.sbapi.models.anagrafiche.Utente;

import java.util.List;

public interface UtenteService {
    void registraUtente(Utente u);
    void aggiornaUtente(Utente u);
    void rimuoviUtente(String id);

    Utente login(String email, String password);

    Utente getUtenteById(String id);

    Utente getUtenteByCF(String cf);
    List<Utente> getAllUtenti();
}