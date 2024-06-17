package br.com.wo.ramengo_api.desafio_backend_rv.order.application.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/orders")
@Tag(name = "Order", description = "Order information")
public interface OrderAPI {

    @PostMapping("")
    @Operation(summary = "Place an Order",
            description = "Place an order")
    @ResponseStatus(code = HttpStatus.CREATED)
    OrderResponse placeAnOrder(@RequestHeader("x-api-key") String apiKey, @Valid @RequestBody OrderRequest orderRequest);
}
