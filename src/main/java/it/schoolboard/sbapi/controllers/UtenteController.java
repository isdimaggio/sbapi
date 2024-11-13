package it.schoolboard.sbapi.controllers;

import it.schoolboard.sbapi.facades.UtenteFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UtenteController {

    private final UtenteFacade facade;

}
