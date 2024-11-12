package it.schoolboard.sbapi.models.anagrafiche;

import it.schoolboard.sbapi.models.generic.AnnoScolastico;
import it.schoolboard.sbapi.models.generic.AssociazioneTutore;
import it.schoolboard.sbapi.models.generic.CensimentoStudente;
import it.schoolboard.sbapi.models.generic.ClassePrecedenteStudente;
import it.schoolboard.sbapi.models.tabelle.Classe;
import it.schoolboard.sbapi.models.tabelle.GruppoRitardoStudente;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document(collection = "studenti")
public class Studente {
    @Id
    private String id;

    @DBRef
    private AnnoScolastico annoScolastico;

    @DBRef
    private Utente utente;

    @DBRef
    private GruppoRitardoStudente gruppoRitardo;

    @DBRef
    private Classe classe;
    private List<ClassePrecedenteStudente> classiPrecedenti;
    private List<AssociazioneTutore> tutori;

    private String codiceSidi; // non so cosa faccia, da capire
    private int sequenzaIscrizione; // +1 per ogni bocciatura, parte da 1
    private boolean isCertificato; // bes / dsa
    private boolean isAutorizzatoFirmaPropria;
    private String autPermEntrataPosticipata;
    private String autPermUscitaAnticipata;
    private boolean isConsensoUsoImmagini;
    private CensimentoStudente censimento;
    private String note; // inserite altre cose come provenienza, titolo amm. ecc..

    //TODO: @CreatedBy @LastModifiedBy per tracciare chi ha modificato

    @CreatedDate
    private LocalDateTime dataCreazione;

    @LastModifiedDate
    private LocalDateTime dataUltimaModifica;
}
