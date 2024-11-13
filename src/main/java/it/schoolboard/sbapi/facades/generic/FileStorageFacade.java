package it.schoolboard.sbapi.facades.generic;

import it.schoolboard.sbapi.services.def.generic.FileStorageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FileStorageFacade {

    private final FileStorageService fileStorageService;

}
