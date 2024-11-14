package it.schoolboard.sbapi.dto.requests.anagrafiche.comunestato;

import jakarta.validation.constraints.*;

import lombok.Data;

@Data
public class CreaComuneStatoRequest {

    @NotBlank(message = "Il campo denominazione non può essere vuoto")
    private String denominazione;

    //TODO: da verificare se il codice ISTAT è composto da 6 cifre
    //@Pattern(regexp = "^\\d{6}$\n", message = "Il codice ISTAT deve essere composto da 6 cifre")
    private int codiceIstat;

    //@Pattern(regexp = "^[A-Z]{1}\\d{3}$\n", message = "Il codice catastale deve essere composto da 3 lettere maiuscole e 1 cifra")
    private String codiceCatastale;

    @NotNull(message = "Il campo isStatoEstero non può essere vuoto")
    private boolean isStatoEstero;

}
