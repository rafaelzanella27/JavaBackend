package com.mobicare.apiREST.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ColaboradorNotFoundException extends Exception{
    public ColaboradorNotFoundException(Long id){
        super("Colaborador não encontrado com ID" + id);

    }


}
