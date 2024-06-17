package br.com.wo.ramengo_api.desafio_backend_rv.order.application.infra;

import br.com.wo.ramengo_api.desafio_backend_rv.exception.handler.APIException;
import br.com.wo.ramengo_api.desafio_backend_rv.order.application.repository.OrderRepository;
import br.com.wo.ramengo_api.desafio_backend_rv.order.domain.PlaceOrder;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OrderRepositoryImpl implements OrderRepository {

    private final Logger logger = LoggerFactory.getLogger(OrderRepositoryImpl.class);

    private final OrderSpringDataRepository orderSpringDataRepository;

    @Override
    public PlaceOrder save(PlaceOrder order) {
        logger.info("[start] OrderServiceImpl - placeAnOrder");
        logger.info("[finished] OrderServiceImpl -placeAnOrder");
        return orderSpringDataRepository.save(order);
    }
}
