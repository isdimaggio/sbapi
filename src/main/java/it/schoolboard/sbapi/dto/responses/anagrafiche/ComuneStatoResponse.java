package it.schoolboard.sbapi.dto.responses.anagrafiche;

import lombok.Data;

@Data
public class ComuneStatoResponse {

        private String id;
        private String denominazione;
        private int codiceIstat;
        private String codiceCatastale;
        private boolean isStatoEstero;

}
