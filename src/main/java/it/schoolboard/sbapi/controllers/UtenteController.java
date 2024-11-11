package it.schoolboard.sbapi.controllers;

import it.schoolboard.sbapi.services.def.UtenteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UtenteController {

    private final UtenteService service;

    @PostMapping("/all/utente/creaUtente/{nome}/{cognome}/{email}/{password}")
    public ResponseEntity<Void> creaUtente (@PathVariable String nome, @PathVariable String cognome, @PathVariable String email, @PathVariable String password) {
        service.creaUtente(nome, cognome, email, password);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/all/utente/{id}")
    public ResponseEntity<?> getUtente(@PathVariable String id) {
        return ResponseEntity.ok(service.getUtente(id));
    }


}
