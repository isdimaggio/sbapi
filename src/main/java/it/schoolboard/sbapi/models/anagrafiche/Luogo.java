package it.schoolboard.sbapi.models.anagrafiche;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "luoghi")
public class Luogo {

    @Id
    private String id;

    private String denominazione;
    private int codiceIstat;
    private String codiceCatastale;
    private boolean isStatoEstero;

}
