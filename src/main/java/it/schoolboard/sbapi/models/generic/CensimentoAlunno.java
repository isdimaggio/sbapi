package it.schoolboard.sbapi.models.generic;

import it.schoolboard.sbapi.utilities.PreferenzaCensimento;
import lombok.Data;

@Data
// NOTA BENE: No @Document perchè viene fatto direttamente l'embed in 'Studente'
public class CensimentoAlunno {

    private PreferenzaCensimento comunicazioneDatiAndamento;
    private PreferenzaCensimento accessoRegistroElettronico;
    private PreferenzaCensimento comunicazioneVitaScolastica;
    private PreferenzaCensimento partecipazioneColloqui;

}
