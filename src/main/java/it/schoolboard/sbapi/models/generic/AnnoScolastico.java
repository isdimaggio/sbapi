package it.schoolboard.sbapi.models.generic;

import it.schoolboard.sbapi.models.anagrafiche.Utente;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Data
@Document(collection = "anniScolastici")
public class AnnoScolastico {
    @Id
    private String id;


    /**
     * Data di inizio dell'anno scolastico
     */

    private LocalDate dataInizio;

    /**
     * Data di fine dell'anno scolastico
     */
    private LocalDate dataFine;

    /**
     * Data di fine del primo quadrimestre
     */
    private LocalDate dataFinePrimoQuad;

    /**
     * Data di fine dei colloqui
     */
    private LocalDate dataFineColloqui;

    /**
     * Giorni di lezione settimanali
     * [default: 6]
     */
    private int giorniLezioneSettimanali;

    /**
     * Numero di ore di lezione giornaliere
     * [default: 6]
     */
    private int oreLezioneGiornaliere;

    /**
     * Numero di ore massimo della durata di un' assemblea di classe
     * [default: 1]
     */
    private int oreMaxAssembleaClasse;

    /**
     * Orario massimo di ingresso a scuola dopo il quale
     * viene registrato un ritardo (viene overridato dai gruppi ritardo)
     * [default: 08:05]
     */
    private LocalTime orarioMaxIngresso;

    /**
     * Gestione separata delle assenze in giornate DAD
     * [default: true]
     */
    private boolean isGestAssDadSeparata;

    /**
     * Visualizza pagelle per i tutor
     * [default: false]
     */
    private boolean isPagelleGenitoriEnabled;

    /**
     * Visualizzazione dei giudizi e delle annotazioni sulla scheda di valutazione
     * [default: true]
     */
    private boolean isGiudiziSuSchedaEnabled;

    /**
     * Annuario scolastico pubblicato
     * [default: false]
     */
    private boolean isAnnuarioScolasticoPubblico;

    /**
     * Lista anni (numerica) per cui è attiva la visualizzazione dell'annuario scolastico
     */
    private List<Integer> anniScolasticiVisAnnuarioPermessa;

    /**
     * Colloqui mattutini online abilitati
     * [default: false]
     */
    private boolean isColloquiMattutiniOnlineEnabled;

    /**
     * Inserimento e giustifica assenze e ritardi solo da parte dello staff
     * [default: false]
     */
    private boolean isGestAssStaffOnly;

    /**
     * Inserimento e giustifica uscite anticipate solo da parte dello staff
     * [default: true]
     */
    private boolean isGestUsciteAntStaffOnly;

    /**
     * Invio della mail per richiesta permesso a protocollo dopo autorizzazione
     * [default: true]
     */
    private boolean isInvioMailPermessoProtocolloEnabled;

    /**
     * Rilevazione presenze e ritardi da totem
     * [default: false]
     */
    private boolean isRilevazionePresenzeTotem;

    /**
     * Massimo ritardo in giorni per la presentazione delle giustifiche
     * [default: 3]
     */
    private int maxRitardoPresentazioneGiustifiche;

    /**
     * Massimo numero di minuti per ritardo breve
     * [default: 10]
     */
    private int maxMinutiRitardoBreve;

    /**
     * Numero di uscite anticipate per quadrimestre che fa
     * scattare allarme rosso sulla pagina
     * [default: 5]
     */
    private int numUsciteAnticipateMaxQuad;

    /**
     * Numero di ritardi per quadrimestre che fa
     * scattare allarme giallo sulla pagina
     * [default: 5]
     */
    private int numRitardiMaxQuad;

    /**
     * Codice meccanografico scuola
     */
    private String codiceMeccanografico;

    /**
     * Nome e Cognome del DSGA
     */
    private String nomeDSGA;

    /**
     * Utente del dirigente scolastico
     */
    private Utente utenzaDirigente;

    /**
     * Utente del vicario del dirigente scolastico
     */
    private Utente utenzaVicarioDirigente;

    /**
     * Abilitazione modalità di sola lettura
     */
    private boolean isModalitaSolaLettura;

    //TODO: @CreatedBy @LastModifiedBy per tracciare chi ha modificato

    @CreatedDate
    private LocalDateTime dataCreazione;

    @LastModifiedDate
    private LocalDateTime dataUltimaModifica;
}
