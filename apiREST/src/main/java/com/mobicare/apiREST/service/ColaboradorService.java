package com.mobicare.apiREST.service;

import lombok.AllArgsConstructor;
import com.mobicare.apiREST.dto.MessageResponseDTO;
import com.mobicare.apiREST.dto.request.ColaboradorDTO;
import com.mobicare.apiREST.entity.Colaborador;
import com.mobicare.apiREST.exception.ColaboradorNotFoundException;
import com.mobicare.apiREST.mapper.ColaboradorMapper;
import com.mobicare.apiREST.repository.ColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ColaboradorService {

    private ColaboradorRepository colaboradorRepository;

    private final ColaboradorMapper colaboradorMapper = ColaboradorMapper.INSTANCE;

    public MessageResponseDTO createColaborador(ColaboradorDTO colaboradorDTO) {
        Colaborador colaboradorToSave = colaboradorMapper.toModel(colaboradorDTO);

        Colaborador savedColaborador = colaboradorRepository.save(colaboradorToSave);
        return createMessageResponse(savedColaborador.getId(), "Criado colaborador com ID ");
    }


    public List<ColaboradorDTO> listAll(){
        List<Colaborador> allPeople = colaboradorRepository.findAll();
        return allPeople.stream()
                .map(colaboradorMapper::toDTO)
                .collect(Collectors.toList());
    }

    public ColaboradorDTO findById(Long id) throws ColaboradorNotFoundException {
        Colaborador colaborador = verifyIfExists(id);

        return colaboradorMapper.toDTO(colaborador);
    }

    public void delete(Long id) throws ColaboradorNotFoundException {
        verifyIfExists(id);

        colaboradorRepository.deleteById(id);
    }

    public MessageResponseDTO updateById(Long id, ColaboradorDTO colaboradorDTO) throws ColaboradorNotFoundException {
        verifyIfExists(id);

        Colaborador colaboradorToUpdate = colaboradorMapper.toModel(colaboradorDTO);

        Colaborador updateColaborador = colaboradorRepository.save(colaboradorToUpdate);
        return createMessageResponse(updateColaborador.getId(), "Atualizado colaborador com ID ");
    }

    private Colaborador verifyIfExists(Long id) throws ColaboradorNotFoundException {
        return colaboradorRepository.findById(id)
                .orElseThrow(() -> new ColaboradorNotFoundException(id));
    }

    private MessageResponseDTO createMessageResponse(Long id, String message) {
        return MessageResponseDTO
                .builder()
                .message(message + id)
                .build();
    }
}
