package it.schoolboard.sbapi.models.anagrafiche;

import it.schoolboard.sbapi.models.abstracts.AuditableEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document(collection = "utenti")
@EqualsAndHashCode(callSuper = false)
public class Utente extends AuditableEntity {

    @Id
    private String id;

    private boolean isSuperUser;
    private boolean isEnabled;

    @Indexed(unique = true)
    private String username;

    private String password;
    private String totpSecret;

    private String cognome;
    private String nome;

    @Indexed(unique = true)
    private String codiceFiscale;

    private LocalDate dataNascita;

    @DBRef
    private ComuneStato luogoNascita;

    @DBRef
    private ComuneStato luogoResidenza;
    private String indirizzoResidenza;

    private String email;
    private String numeroTelefono;

    private String note;

}
