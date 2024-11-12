package it.schoolboard.sbapi.models.abstracts;

import lombok.Data;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Data
public abstract class AuditableEditsEntity {

    @LastModifiedBy
    private String modificatoDa;

    @LastModifiedDate
    private LocalDateTime tsUltimaModifica;

}
