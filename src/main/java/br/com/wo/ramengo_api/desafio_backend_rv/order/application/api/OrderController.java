
package br.com.wo.ramengo_api.desafio_backend_rv.order.application.api;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController implements OrderAPI {

    private final Logger logger = LoggerFactory.getLogger(OrderController.class);
    @Override
    public OrderResponse placeAnOrder(OrderRequest orderRequest) {
        logger.info("[start] OrderController - placeAnOrder");
        logger.info("[finished] OrderController -placeAnOrder");
        return null;
    }
}
