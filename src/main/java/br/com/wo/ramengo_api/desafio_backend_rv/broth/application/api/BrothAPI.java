package br.com.wo.ramengo_api.desafio_backend_rv.broth.application.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/broths")
@Tag(name = "Broth", description = "")
public interface BrothAPI {

//    @PostMapping
//    @Operation(summary = "Broth creation",
//            description = "This role is responsible for creating candidate")
//    BrothResponse createBroth(@Valid @RequestBody BrothRequest brothRequest);

    @GetMapping
    @Operation(summary = "List all available broths",
            description = "A list of broths")
    @ResponseStatus(code = HttpStatus.OK)
    List<BrothListResponse> listAllBroths(@RequestHeader("x-api-key") String apiKey);
}
