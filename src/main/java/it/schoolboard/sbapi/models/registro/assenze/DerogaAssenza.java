package it.schoolboard.sbapi.models.registro.assenze;

import it.schoolboard.sbapi.models.anagrafiche.Studente;
import it.schoolboard.sbapi.models.generic.AnnoScolastico;
import it.schoolboard.sbapi.models.generic.DataNumeroOre;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "derogheAssenze")
@EqualsAndHashCode(callSuper = false)
public class DerogaAssenza {

    @Id
    private String id;

    @DBRef
    private AnnoScolastico annoScolastico;

    @DBRef
    private Studente studente;

    private String motivo;

    private List<DataNumeroOre> giorni;

}
