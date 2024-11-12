package it.schoolboard.sbapi.models.anagrafiche;

import it.schoolboard.sbapi.models.abstracts.AuditableEntity;
import it.schoolboard.sbapi.models.generic.AnnoScolastico;
import it.schoolboard.sbapi.models.generic.AssociazioneTutore;
import it.schoolboard.sbapi.models.generic.CensimentoAlunno;
import it.schoolboard.sbapi.models.generic.ClassePrecedenteAlunno;
import it.schoolboard.sbapi.models.tabelle.Classe;
import it.schoolboard.sbapi.models.tabelle.GruppoRitardoAlunno;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "alunni")
@EqualsAndHashCode(callSuper = false)
public class Alunno extends AuditableEntity {
    @Id
    private String id;

    @DBRef
    private AnnoScolastico annoScolastico;

    @DBRef
    private Utente utente;

    @DBRef
    private GruppoRitardoAlunno gruppoRitardo;

    @DBRef
    private Classe classe;
    private List<ClassePrecedenteAlunno> classiPrecedenti;
    private List<AssociazioneTutore> tutori;

    private String codiceSidi; // non so cosa faccia, da capire
    private int sequenzaIscrizione; // +1 per ogni bocciatura, parte da 1
    private boolean isCertificato; // bes / dsa
    private boolean isAutorizzatoFirmaPropria;
    private String autPermEntrataPosticipata;
    private String autPermUscitaAnticipata;
    private boolean isConsensoUsoImmagini;
    private CensimentoAlunno censimento;
    private String note; // inserite altre cose come provenienza, titolo amm. ecc..
}
