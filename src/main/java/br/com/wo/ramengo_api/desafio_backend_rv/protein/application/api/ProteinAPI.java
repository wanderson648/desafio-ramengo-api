package br.com.wo.ramengo_api.desafio_backend_rv.protein.application.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/proteins")
@Tag(name = "Protein", description = "")
public interface ProteinAPI {

//    @PostMapping
//    @ResponseStatus(code = HttpStatus.CREATED)
//    @Operation(summary = "Create a protein",
//            description = "Create a protein")
//    ProteinResponse createProtein(@Valid @RequestBody ProteinRequest proteinRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    @Operation(summary = "List all available proteins",
            description = "A list of proteins")
    List<ProteinListResponse> listAllProtein();
}
