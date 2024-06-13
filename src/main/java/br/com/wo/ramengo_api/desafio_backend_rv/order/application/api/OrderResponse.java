package br.com.wo.ramengo_api.desafio_backend_rv.order.application.api;

import lombok.Builder;

@Builder
public record OrderResponse(String orderCode) {
}
