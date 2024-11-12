package it.schoolboard.sbapi.services.impl;

import it.schoolboard.sbapi.models.anagrafiche.ComuneStato;
import it.schoolboard.sbapi.models.anagrafiche.Utente;
import it.schoolboard.sbapi.repositories.anagrafiche.LuogoRepository;
import it.schoolboard.sbapi.repositories.anagrafiche.UtenteRepository;
import it.schoolboard.sbapi.services.def.UtenteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UtenteServiceMongo implements UtenteService {

    private final UtenteRepository utenteRepository;
    private final LuogoRepository luogoRepository;

    @Override
    public void creaUtente(String nome, String cognome, String email, String password) {
        Utente utente = new Utente();
        utente.setNome(nome);
        utente.setCognome(cognome);
        utente.setEmail(email);
        utente.setPassword(password);

        ComuneStato luogo = new ComuneStato();
        luogo.setDenominazione("Roma");
        luogo.setCodiceCatastale("H501");
        luogoRepository.save(luogo);

        utente.setLuogoNascita(luogo);
        utenteRepository.save(utente);
    }

    @Override
    public Utente getUtente(String id) {
        return utenteRepository.findById(id).orElse(null);
    }

}
