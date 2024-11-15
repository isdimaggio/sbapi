package it.schoolboard.sbapi.models.generic;

import it.schoolboard.sbapi.models.abstracts.AuditableEditsEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "configurazioneRegistro")
@EqualsAndHashCode(callSuper = false)
/*
 Viene inserito all'installazione del registro con dei valori di default,
 il documento può essere modificato ma NON inserito NE eliminato dall'admin.
 */
public class ConfigurazioneRegistro extends AuditableEditsEntity {
    @Id
    private long id; // UNICO ID VALIDO È 0

    /**
     * Nome scuola
     */
    private String nomeScuola;

    /**
     * Indirizzo Scuola
     */
    private String indirizzoScuola;

    /**
     * Indirizzo web della scuola
     */
    private String urlScuola;

    /**
     * Numero annualità da gestire
     * [default: 5]
     */
    private int numAnniScolastici;

    /**
     * Reset password autonomo abilitato
     */
    private boolean isResetPasswordAutonomoEnabled;

    /**
     * Indirizzo mail per comunicazione richieste astensione dal lavoro
     */
    private String emailDestRichiesteAstensione;

    /**
     * Indirizzo mail del responsabile delle sostituzioni docenti assenti
     */
    private String emailResponsabileSostituzioni;

    /**
     * Indirizzo di partenza delle mail
     */
    private String emailFrom;

    /**
     * Indirizzio server SMTP
     */
    private String smtpServer;

    /**
     * Porta server SMTP
     */
    private int smtpPort;

    /**
     * Username server SMTP
     */
    private String smtpUsername;

    /**
     * Password server SMTP
     */
    private String smtpPassword;

    /**
     * Crittografia server SMTP
     */
    private String smtpEncryption;
}
