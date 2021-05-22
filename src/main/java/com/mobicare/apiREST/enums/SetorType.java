package com.mobicare.apiREST.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SetorType {
    DIRETORIA ("Diretoria"),
    ADMINISTRATIVO ("Administrativo"),
    FINANCEIRO ("Financeiro");

    private final String description;

}
