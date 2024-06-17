package br.com.wo.ramengo_api.desafio_backend_rv.order.application.repository;

import br.com.wo.ramengo_api.desafio_backend_rv.order.domain.PlaceOrder;

public interface OrderRepository {
    PlaceOrder save(PlaceOrder order);
}
