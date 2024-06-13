package br.com.wo.ramengo_api.desafio_backend_rv.order.domain;

import br.com.wo.ramengo_api.desafio_backend_rv.order.application.api.OrderRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PlaceOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "broth_id")
    private Integer brothId;

    @Column(name = "protein_id")
    private Integer proteinId;

    @Column(name = "order_id")
    private String orderId;

    public PlaceOrder(OrderRequest orderRequest) {
        this.brothId = orderRequest.brothId();
        this.proteinId = orderRequest.proteinId();
    }

    public String generatedCode() {
        long code = (long) Math.floor(Math.random() * 100000);
        this.orderId = String.valueOf(code);
        return orderId;
    }
}
