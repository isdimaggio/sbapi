package it.schoolboard.sbapi.facades;

import it.schoolboard.sbapi.services.def.UtenteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UtenteFacade {

    private final UtenteService utenteService;

}
