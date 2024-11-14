package it.schoolboard.sbapi.controllers.anagrafiche;

import it.schoolboard.sbapi.dto.requests.anagrafiche.comunestato.CreaComuneStatoRequest;
import it.schoolboard.sbapi.facades.anagrafiche.ComuneStatoFacade;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comunestato")
@RequiredArgsConstructor
public class ComuneStatoController {
    private final ComuneStatoFacade facade;

    @PostMapping("/crea")
    public ResponseEntity<Void> creaComuneStato (@Valid @RequestBody CreaComuneStatoRequest request) {
        facade.creaComuneStato(request);
        return ResponseEntity.ok().build();
    }

    //TODO: implementare altri metodi
}
