package it.schoolboard.sbapi.mappers.anagrafiche;

import it.schoolboard.sbapi.dto.requests.anagrafiche.comunestato.CreaComuneStatoRequest;
import it.schoolboard.sbapi.dto.responses.anagrafiche.ComuneStatoResponse;
import it.schoolboard.sbapi.models.anagrafiche.ComuneStato;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ComuneStatoMapper {
    public ComuneStato fromCreaComuneStatoRequest(CreaComuneStatoRequest cDTO) {
        ComuneStato c = new ComuneStato();
        c.setDenominazione(cDTO.getDenominazione());
        c.setCodiceIstat(cDTO.getCodiceIstat());
        c.setCodiceCatastale(cDTO.getCodiceCatastale());
        c.setStatoEstero(cDTO.isStatoEstero());

        return c;
    }

    public ComuneStatoResponse toComuneStatoResponse(ComuneStato c) {
        ComuneStatoResponse cDTO = new ComuneStatoResponse();
        cDTO.setId(c.getId());
        cDTO.setDenominazione(c.getDenominazione());
        cDTO.setCodiceIstat(c.getCodiceIstat());
        cDTO.setCodiceCatastale(c.getCodiceCatastale());
        cDTO.setStatoEstero(c.isStatoEstero());

        return cDTO;
    }

    public List<ComuneStatoResponse> toComuneStatoResponseList(List<ComuneStato> comuni) {
        return comuni.stream().map(this::toComuneStatoResponse).collect(Collectors.toList());
    }


}
