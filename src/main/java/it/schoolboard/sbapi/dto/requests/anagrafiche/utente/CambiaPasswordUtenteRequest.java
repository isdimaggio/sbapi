package it.schoolboard.sbapi.dto.requests.anagrafiche.utente;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class CambiaPasswordUtenteRequest {
    @NotBlank(message = "Il campo id non può essere vuoto")
    private String id;

    //TODO: decidere se fare il controllo con una regex da back-end
    @NotNull(message = "Il campo vecchiaPassword non può essere vuoto")
    //@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$", message = "Password non valida")
    private String vecchiaPassword;

    @NotNull(message = "Il campo nuovaPassword non può essere vuoto")
    //@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$", message = "La password deve contenere almeno 8 caratteri, di cui almeno una lettera maiuscola, una lettera minuscola e un numero")
    private String nuovaPassword;

    @NotNull(message = "Il campo nuovaPasswordRipetuta non può essere vuoto")
    private String nuovaPasswordRipetuta;
}
