package br.com.wo.ramengo_api.desafio_backend_rv.order.domain;

import br.com.wo.ramengo_api.desafio_backend_rv.broth.domain.Broth;
import br.com.wo.ramengo_api.desafio_backend_rv.order.application.api.OrderRequest;
import br.com.wo.ramengo_api.desafio_backend_rv.protein.domain.Protein;
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
    private Long id;

    @ManyToOne
    @JoinColumn(name = "broth_id", insertable = false, updatable = false)
    private Broth broth;

    @ManyToOne
    @JoinColumn(name = "protein_id", insertable = false, updatable = false)
    private Protein protein;

    @Column(name = "broth_id", nullable = false)
    private Integer brothId;

    @Column(name = "protein_id", nullable = false)
    private Integer proteinId;

    public PlaceOrder(OrderRequest orderRequest) {
        this.brothId = orderRequest.brothId();
        this.proteinId = orderRequest.proteinId();
    }

}
