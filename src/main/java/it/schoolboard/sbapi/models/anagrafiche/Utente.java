package it.schoolboard.sbapi.models.anagrafiche;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Document(collection = "utenti")
public class Utente {

    @Id
    private String id;

    private String username;
    private String password;
    private String totpSecret;

    private String cognome;
    private String nome;
    private String codiceFiscale;
    private LocalDate dataNascita;

    @DBRef
    private Luogo luogoNascita;

    @DBRef
    private Luogo luogoResidenza;
    private String indirizzoResidenza;

    private String email;
    private String numeroTelefono;

    private String note;

    //TODO: @CreatedBy e @LastModifiedBy per tracciare chi ha creato e modificato l'utente. Vedi Spring Security

    @CreatedDate
    private LocalDateTime dataCreazione;

    @LastModifiedDate
    private LocalDateTime dataUltimaModifica;

}
