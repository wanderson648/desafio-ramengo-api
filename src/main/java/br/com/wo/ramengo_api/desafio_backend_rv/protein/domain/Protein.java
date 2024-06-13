package br.com.wo.ramengo_api.desafio_backend_rv.protein.domain;

import br.com.wo.ramengo_api.desafio_backend_rv.protein.application.api.ProteinRequest;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Protein {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank
    private String name;
    @NotBlank
    private String description;
    @NotNull
    private BigDecimal price;

    public Protein(ProteinRequest proteinRequest) {
        this.name = proteinRequest.name();
        this.description = proteinRequest.description();
        this.price = proteinRequest.price();
    }
}
