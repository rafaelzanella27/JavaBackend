package com.mobicare.apiREST.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ColaboradorDTO {

    private Long id;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String name;

    @NotEmpty
    @CPF
    private String cpf;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String telefone;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String email;

    private String birthDate;

    @Valid
    @NotEmpty
    private List<SetorDTO> setor;
}
