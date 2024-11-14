package it.schoolboard.sbapi.dto.responses.anagrafiche;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UtenteResponse {
    private String id;
    private boolean isSuperUser;
    private boolean isEnabled;
    private String username;

    //TODO: rimuovere password da qui (solo test)
    private String password;


    private String totpSecret;
    private boolean isTotpEnabled;

    private String cognome;
    private String nome;
    private String codiceFiscale;
    private LocalDate dataNascita;

    //TODO: da decidere come gestire i comuni (se inviare il nome o il codice catastale o l'oggetto in output)
    private String luogoNascita;
    private String luogoResidenza;

    private String indirizzoResidenza;
    private String email;
    private String numeroTelefono;
    private String note;
}
