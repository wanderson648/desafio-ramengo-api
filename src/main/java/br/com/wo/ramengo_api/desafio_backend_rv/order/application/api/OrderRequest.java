package br.com.wo.ramengo_api.desafio_backend_rv.order.application.api;

import jakarta.validation.constraints.NotNull;

public record OrderRequest(@NotNull Integer brothId,
                           @NotNull Integer proteinId) {
}
