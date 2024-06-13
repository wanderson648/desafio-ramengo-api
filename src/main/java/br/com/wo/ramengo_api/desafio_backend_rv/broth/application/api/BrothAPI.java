package br.com.wo.ramengo_api.desafio_backend_rv.broth.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/broths")
public interface BrothAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    BrothResponse createBroth(@Valid @RequestBody BrothRequest brothRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<BrothListResponse> listAllBroths();
}
