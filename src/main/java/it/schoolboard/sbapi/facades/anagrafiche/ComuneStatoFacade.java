package it.schoolboard.sbapi.facades.anagrafiche;

import it.schoolboard.sbapi.dto.requests.anagrafiche.comunestato.CreaComuneStatoRequest;
import it.schoolboard.sbapi.dto.responses.anagrafiche.ComuneStatoResponse;
import it.schoolboard.sbapi.mappers.anagrafiche.ComuneStatoMapper;
import it.schoolboard.sbapi.models.anagrafiche.ComuneStato;
import it.schoolboard.sbapi.services.def.anagrafiche.ComuneStatoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ComuneStatoFacade {

    private final ComuneStatoService comuneStatoService;
    private final ComuneStatoMapper comuneStatoMapper;

    public void creaComuneStato(CreaComuneStatoRequest cDTO) {
        ComuneStato c = comuneStatoMapper.fromCreaComuneStatoRequest(cDTO);
        comuneStatoService.creaComuneStato(c);
    }

    public void aggiornaComuneStato(ComuneStato c) {
        comuneStatoService.aggiornaComuneStato(c);
    }

    public void rimuoviComuneStato(String id) {
        comuneStatoService.rimuoviComuneStato(id);
    }

    public ComuneStatoResponse getComuneStatoById(String id) {
        return comuneStatoMapper.toComuneStatoResponse(comuneStatoService.getComuneStatoById(id));
    }

    public ComuneStatoResponse getComuneStatoByDenominazione(String denominazione) {
        return comuneStatoMapper.toComuneStatoResponse(comuneStatoService.getComuneStatoByDenominazione(denominazione));
    }

    public List<ComuneStatoResponse> getAllComuniStato() {
        return comuneStatoMapper.toComuneStatoResponseList(comuneStatoService.getAllComuniStato());
    }
}
