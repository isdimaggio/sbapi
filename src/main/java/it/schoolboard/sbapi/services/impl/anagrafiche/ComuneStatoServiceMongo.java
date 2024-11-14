package it.schoolboard.sbapi.services.impl.anagrafiche;

import it.schoolboard.sbapi.models.anagrafiche.ComuneStato;
import it.schoolboard.sbapi.repositories.anagrafiche.ComuneStatoRepository;
import it.schoolboard.sbapi.services.def.anagrafiche.ComuneStatoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ComuneStatoServiceMongo implements ComuneStatoService {

    private final ComuneStatoRepository repo;

    @Override
    public void creaComuneStato(ComuneStato c) {
        if (c.getId() != null) throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        repo.save(c);

    }

    @Override
    public void aggiornaComuneStato(ComuneStato c) {
        if (c.getId() == null) throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        repo.save(c);
    }

    @Override
    public void rimuoviComuneStato(String id) {
        repo.deleteById(id);
    }

    @Override
    public ComuneStato getComuneStatoById(String id) {
        return repo.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @Override
    public ComuneStato getComuneStatoByDenominazione(String denominazione) {
        return repo.findByDenominazione(denominazione).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @Override
    public List<ComuneStato> getAllComuniStato() {
        return repo.findAll();
    }
}
