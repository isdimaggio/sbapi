package it.schoolboard.sbapi.services.impl.anagrafiche;

import it.schoolboard.sbapi.models.anagrafiche.Utente;
import it.schoolboard.sbapi.repositories.anagrafiche.UtenteRepository;
import it.schoolboard.sbapi.services.def.anagrafiche.UtenteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UtenteServiceMongo implements UtenteService {

    private final UtenteRepository repo;

    @Override
    public void creaUtente(Utente u) {
        if (u.getId() != null) throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        repo.save(u);
    }

    @Override
    public void aggiornaUtente(Utente u) {
        if (u.getId() == null) throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        repo.save(u);
    }

    @Override
    public void rimuoviUtente(String id) {
        repo.deleteById(id);
    }

    @Override
    public Utente loginViaUsername(String username, String password) {
        return repo.findByUsernameAndPassword(username, password)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @Override
    public Utente getUtenteById(String id) {
        return repo.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @Override
    public Utente getUtenteByCF(String cf) {
        return repo.findByCodiceFiscale(cf).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @Override
    public List<Utente> getAllUtenti() {
        return repo.findAll();
    }
}
