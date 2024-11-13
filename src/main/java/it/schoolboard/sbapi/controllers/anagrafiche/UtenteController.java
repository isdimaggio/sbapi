package it.schoolboard.sbapi.controllers.anagrafiche;

import it.schoolboard.sbapi.facades.anagrafiche.UtenteFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/utente")
@RequiredArgsConstructor
public class UtenteController {

    private final UtenteFacade facade;

}
