package it.schoolboard.sbapi.facades.anagrafiche;

import it.schoolboard.sbapi.services.def.anagrafiche.UtenteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UtenteFacade {

    private final UtenteService utenteService;

}
