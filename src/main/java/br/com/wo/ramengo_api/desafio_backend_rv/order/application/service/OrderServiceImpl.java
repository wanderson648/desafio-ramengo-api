package br.com.wo.ramengo_api.desafio_backend_rv.order.application.service;

import br.com.wo.ramengo_api.desafio_backend_rv.order.application.api.OrderController;
import br.com.wo.ramengo_api.desafio_backend_rv.order.application.api.OrderRequest;
import br.com.wo.ramengo_api.desafio_backend_rv.order.application.api.OrderResponse;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);
    @Override
    public OrderResponse placeAnOrder(OrderRequest orderRequest) {
        logger.info("[start] OrderServiceImpl - placeAnOrder");
        logger.info("[finished] OrderServiceImpl -placeAnOrder");
        return null;
    }
}
