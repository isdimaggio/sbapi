package it.schoolboard.sbapi.models.generic;

import lombok.Data;

import java.time.LocalDate;

@Data
// embedded in deroga assenza
public class DataNumeroOre {

    private LocalDate data;
    private int numeroOre;
}
