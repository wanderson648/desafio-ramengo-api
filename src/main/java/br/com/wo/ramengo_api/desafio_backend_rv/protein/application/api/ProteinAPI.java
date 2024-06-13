package br.com.wo.ramengo_api.desafio_backend_rv.protein.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/proteins")
public interface ProteinAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    ProteinResponse createProtein(@Valid @RequestBody ProteinRequest proteinRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<ProteinListResponse> listAllProtein();
}
