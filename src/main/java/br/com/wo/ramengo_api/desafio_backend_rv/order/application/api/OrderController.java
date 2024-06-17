
package br.com.wo.ramengo_api.desafio_backend_rv.order.application.api;

import br.com.wo.ramengo_api.desafio_backend_rv.exception.handler.APIException;
import br.com.wo.ramengo_api.desafio_backend_rv.order.application.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController implements OrderAPI {

    @Value("${x-api-key}")
    private String xApiKey;
    private final Logger logger = LoggerFactory.getLogger(OrderController.class);

    private final OrderService orderService;
    @Override
    public OrderResponse placeAnOrder(String apiKey, OrderRequest orderRequest) {
        logger.info("[start] OrderController - placeAnOrder");
        if (!(apiKey.equals(xApiKey)) || apiKey.equals(" "))
            throw APIException.build(HttpStatus.FORBIDDEN, "x-api-key header missing");
        logger.info("[finished] OrderController -placeAnOrder");
        return orderService.placeAnOrder(orderRequest);
    }
}
