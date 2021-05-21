package com.mobicare.apiREST.controller;

import com.mobicare.apiREST.dto.MessageResponseDTO;
import com.mobicare.apiREST.dto.request.ColaboradorDTO;
import com.mobicare.apiREST.exception.ColaboradorNotFoundException;
import com.mobicare.apiREST.service.ColaboradorService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/colaborador")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ColaboradorController {

    private ColaboradorService colaboradorService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createColaborador(@RequestBody @Valid ColaboradorDTO colaboradorDTO) {
        return colaboradorService.createColaborador(colaboradorDTO);

    }

    @GetMapping
    public List<ColaboradorDTO> listAll(){
        return colaboradorService.listAll();
    }

    @GetMapping("/{id}")
    public ColaboradorDTO findById(@PathVariable Long id) throws ColaboradorNotFoundException {
        return colaboradorService.findById(id);
    }

    @PutMapping("/{id}")
    public MessageResponseDTO updateById(@PathVariable Long id, @RequestBody @Valid ColaboradorDTO colaboradorDTO) throws ColaboradorNotFoundException {
        return colaboradorService.updateById(id, colaboradorDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) throws ColaboradorNotFoundException {
        colaboradorService.delete(id);
    }

}
