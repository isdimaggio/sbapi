package it.schoolboard.sbapi.dto.requests.anagrafiche.utente;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LoginUtenteViaUsernameRequest {

    @NotBlank(message = "Il campo username non può essere vuoto")
    private String username;

    @NotNull(message = "Il campo password non può essere vuoto")
    private String password;

}
