package it.schoolboard.sbapi.dto.requests.anagrafiche.utente;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CreaUtenteRequest {

    @NotBlank(message = "Il campo username non può essere vuoto")
    private String username;

    //TODO: decidere se fare il controllo con una regex da back-end
    @NotBlank(message = "Il campo password non può essere vuoto")
    //@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$", message = "Password non valida")
    private String password;

    @NotBlank(message = "Il campo cognome non può essere vuoto")
    private String cognome;

    @NotBlank(message = "Il campo nome non può essere vuoto")
    private String nome;

    @NotBlank(message = "Il campo codiceFiscale non può essere vuoto")
    @Pattern(regexp = "^[A-Z]{6}[0-9]{2}[A-EHLMPR-T][0-9]{2}[A-Z][0-9]{3}[A-Z]$", message = "Il codice fiscale non è valido")
    private String codiceFiscale;

    @Past(message = "La data di nascita deve essere nel passato")
    private LocalDate dataNascita;

    //TODO: da decidere come gestire i comuni (se inviare il nome o il codice catastale)
    private String luogoNascita;
    private String luogoResidenza;

    private String indirizzoResidenza;

    private String email;
    private String numeroTelefono;

    private String note;
}
