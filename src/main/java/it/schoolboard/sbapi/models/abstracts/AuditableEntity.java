package it.schoolboard.sbapi.models.abstracts;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class AuditableEntity extends AuditableEditsEntity{

    @CreatedBy
    private String creatoDa;

    @CreatedDate
    private LocalDateTime tsCreazione;


}
