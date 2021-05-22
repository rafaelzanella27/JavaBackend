package com.mobicare.apiREST.dto.request;

import com.mobicare.apiREST.enums.SetorType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SetorDTO {
    private Long id;

    @Enumerated(EnumType.STRING)
    private SetorType type;

    @NotEmpty
    @Size(min = 2, max = 14)
    private String nomeSetor;
}
