package it.schoolboard.sbapi.mappers.anagrafiche;

import it.schoolboard.sbapi.dto.requests.anagrafiche.utente.CreaUtenteRequest;
import it.schoolboard.sbapi.dto.responses.anagrafiche.UtenteResponse;
import it.schoolboard.sbapi.models.anagrafiche.Utente;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UtenteMapper {
    public Utente fromCreaUtenteRequest(CreaUtenteRequest uDTO) {
        Utente u = new Utente();
        u.setUsername(uDTO.getUsername());
        u.setPassword(uDTO.getPassword());
        u.setNome(uDTO.getNome());
        u.setCognome(uDTO.getCognome());
        u.setCodiceFiscale(uDTO.getCodiceFiscale());
        u.setDataNascita(uDTO.getDataNascita());

        //TODO: unire nel facade i luoghi di nascita e residenza`

        u.setIndirizzoResidenza(uDTO.getIndirizzoResidenza());
        u.setEmail(uDTO.getEmail());
        u.setNumeroTelefono(uDTO.getNumeroTelefono());
        u.setNote(uDTO.getNote());

        return u;
    }

    public UtenteResponse toUtenteResponse(Utente u) {
        UtenteResponse uDTO = new UtenteResponse();
        uDTO.setId(u.getId());
        uDTO.setSuperUser(u.isSuperUser());
        uDTO.setEnabled(u.isEnabled());
        uDTO.setUsername(u.getUsername());
        uDTO.setPassword(u.getPassword());
        uDTO.setTotpSecret(u.getTotpSecret());
        uDTO.setTotpEnabled(u.isTotpEnabled());
        uDTO.setNome(u.getNome());
        uDTO.setCognome(u.getCognome());
        uDTO.setCodiceFiscale(u.getCodiceFiscale());
        uDTO.setDataNascita(u.getDataNascita());
        uDTO.setLuogoNascita(u.getLuogoNascita().getDenominazione());
        uDTO.setLuogoResidenza(u.getLuogoResidenza().getDenominazione());
        uDTO.setIndirizzoResidenza(u.getIndirizzoResidenza());
        uDTO.setEmail(u.getEmail());
        uDTO.setNumeroTelefono(u.getNumeroTelefono());
        uDTO.setNote(u.getNote());

        return uDTO;
    }

    public List<UtenteResponse> toUtenteResponseList(List<Utente> utenti) {
        return utenti.stream().map(this::toUtenteResponse).collect(Collectors.toList());
    }

}
