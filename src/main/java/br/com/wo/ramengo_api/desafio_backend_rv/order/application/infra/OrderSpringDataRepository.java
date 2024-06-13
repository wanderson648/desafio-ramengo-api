package br.com.wo.ramengo_api.desafio_backend_rv.order.application.infra;

import br.com.wo.ramengo_api.desafio_backend_rv.order.domain.PlaceOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderSpringDataRepository extends JpaRepository<PlaceOrder, Integer> {
}
