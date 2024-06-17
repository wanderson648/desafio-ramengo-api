package br.com.wo.ramengo_api.desafio_backend_rv.protein.application.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/proteins")
@Tag(name = "Protein", description = "Protein information")
public interface ProteinAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    @Operation(summary = "Create a protein",
            description = "Create a protein")
    ProteinResponse createProtein(@Valid @RequestBody ProteinRequest proteinRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    @Operation(summary = "List of Proteins",
            description = "Gets the list of all proteins")
    List<ProteinListResponse> listAllProtein();
}
