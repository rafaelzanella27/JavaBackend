package com.mobicare.apiREST.mapper;
import com.mobicare.apiREST.dto.request.ColaboradorDTO;
import com.mobicare.apiREST.entity.Colaborador;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ColaboradorMapper {

    ColaboradorMapper INSTANCE = Mappers.getMapper(ColaboradorMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Colaborador toModel(ColaboradorDTO colaboradorDTO);

    ColaboradorDTO toDTO(Colaborador colaborador);

}
