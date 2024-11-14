package it.schoolboard.sbapi.facades.anagrafiche;

import it.schoolboard.sbapi.dto.requests.anagrafiche.utente.CambiaPasswordUtenteRequest;
import it.schoolboard.sbapi.dto.requests.anagrafiche.utente.CreaUtenteRequest;
import it.schoolboard.sbapi.dto.requests.anagrafiche.utente.LoginUtenteViaUsernameRequest;
import it.schoolboard.sbapi.dto.responses.anagrafiche.UtenteResponse;
import it.schoolboard.sbapi.mappers.anagrafiche.UtenteMapper;
import it.schoolboard.sbapi.models.anagrafiche.Utente;
import it.schoolboard.sbapi.services.def.anagrafiche.ComuneStatoService;
import it.schoolboard.sbapi.services.def.anagrafiche.UtenteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UtenteFacade {

    private final UtenteService utenteService;
    private final ComuneStatoService comuneStatoService;

    private final UtenteMapper utenteMapper;

    public void creaUtente(CreaUtenteRequest request) {
        Utente u = utenteMapper.fromCreaUtenteRequest(request);

        if (!request.getLuogoNascita().isBlank()) u.setLuogoNascita(comuneStatoService.getComuneStatoByDenominazione(request.getLuogoNascita()));
        if (!request.getLuogoResidenza().isBlank()) u.setLuogoResidenza(comuneStatoService.getComuneStatoByDenominazione(request.getLuogoResidenza()));

        utenteService.creaUtente(u);
    }

    public void cambiaPassword(CambiaPasswordUtenteRequest request) {
        Utente u = utenteService.getUtenteById(request.getId());

        if (!u.getPassword().equals(request.getVecchiaPassword())) throw new ResponseStatusException(HttpStatus.FORBIDDEN);

        if (!request.getNuovaPassword().equals(request.getNuovaPasswordRipetuta())) throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Le password non coincidono!");

        u.setPassword(request.getNuovaPassword());
        utenteService.aggiornaUtente(u);
    }

    public Utente loginViaUsername(LoginUtenteViaUsernameRequest request) {
        return utenteService.loginViaUsername(request.getUsername(), request.getPassword());
    }

    public UtenteResponse getUtenteById(String id) {
        return utenteMapper.toUtenteResponse(utenteService.getUtenteById(id));
    }

    public List<UtenteResponse> getAllUtenti() {
        return utenteMapper.toUtenteResponseList(utenteService.getAllUtenti());
    }

    //TODO: scegliere se eliminare o disattivare
    public void rimuoviUtente(String id) {
        utenteService.rimuoviUtente(id);
    }

}
