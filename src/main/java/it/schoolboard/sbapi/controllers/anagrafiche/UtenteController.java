package it.schoolboard.sbapi.controllers.anagrafiche;

import it.schoolboard.sbapi.dto.requests.anagrafiche.utente.CambiaPasswordUtenteRequest;
import it.schoolboard.sbapi.dto.requests.anagrafiche.utente.CreaUtenteRequest;
import it.schoolboard.sbapi.dto.requests.anagrafiche.utente.LoginUtenteViaUsernameRequest;
import it.schoolboard.sbapi.dto.responses.anagrafiche.UtenteResponse;
import it.schoolboard.sbapi.facades.anagrafiche.UtenteFacade;
import it.schoolboard.sbapi.models.anagrafiche.Utente;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//TODO: impostare security

@RestController
@RequestMapping("/utente")
@RequiredArgsConstructor
public class UtenteController {

    private final UtenteFacade facade;

    @PostMapping("/crea")
    public ResponseEntity<Void> creaUtente (@Valid @RequestBody CreaUtenteRequest request) {
        facade.creaUtente(request);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/loginViaUsername")
    public ResponseEntity<Void> loginViaUsername (@Valid @RequestBody LoginUtenteViaUsernameRequest request) {
        Utente u = facade.loginViaUsername(request);
        //return ResponseEntity.status(HttpStatus.OK).header("Authorization", service.creaToken(u)).build();
        return ResponseEntity.ok().build();
    }

    //TODO: prendere ID attraverso token
    @PostMapping("/cambiaPassword")
    public ResponseEntity<Void> cambiaPassword (@Valid @RequestBody CambiaPasswordUtenteRequest request) {
        facade.cambiaPassword(request);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getUtenteById/{id}")
    public ResponseEntity<UtenteResponse> getUtenteById(@PathVariable String id) {
        return ResponseEntity.ok(facade.getUtenteById(id));
    }

    @GetMapping("/getAllUtenti")
    public ResponseEntity<List<UtenteResponse>> getAllUtenti() {
        return ResponseEntity.ok(facade.getAllUtenti());
    }

    @DeleteMapping("/rimuoviUtente/{id}")
    public ResponseEntity<Void> rimuoviUtente(@PathVariable String id) {
        facade.rimuoviUtente(id);
        return ResponseEntity.ok().build();
    }

}
