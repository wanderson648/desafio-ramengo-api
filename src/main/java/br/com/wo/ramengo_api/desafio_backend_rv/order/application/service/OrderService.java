package br.com.wo.ramengo_api.desafio_backend_rv.order.application.service;

import br.com.wo.ramengo_api.desafio_backend_rv.order.application.api.OrderRequest;
import br.com.wo.ramengo_api.desafio_backend_rv.order.application.api.OrderResponse;

public interface OrderService {
    OrderResponse placeAnOrder(OrderRequest orderRequest);
}
