package br.com.wo.ramengo_api.desafio_backend_rv.order.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/orders")
public interface OrderAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    OrderResponse placeAnOrder(@Valid @RequestBody OrderRequest orderRequest);
}
