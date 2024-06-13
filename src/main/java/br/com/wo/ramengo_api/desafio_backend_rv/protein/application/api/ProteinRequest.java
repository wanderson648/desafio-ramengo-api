package br.com.wo.ramengo_api.desafio_backend_rv.protein.application.api;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProteinRequest(
        @NotBlank String name,
        @NotBlank String description,
        @NotNull BigDecimal price) {
}
