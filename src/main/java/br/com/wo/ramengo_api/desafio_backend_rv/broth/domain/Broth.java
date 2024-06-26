package br.com.wo.ramengo_api.desafio_backend_rv.broth.domain;

import br.com.wo.ramengo_api.desafio_backend_rv.broth.application.api.BrothRequest;
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
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Broth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank
    private String imageInactive;
    @NotBlank
    private String imageActive;
    @NotBlank
    private String name;
    @NotBlank
    private String description;
    @NotNull
    private BigDecimal price;

    public Broth(BrothRequest brothRequest) {
        this.imageInactive = brothRequest.imageInactive();
        this.imageActive = brothRequest.imageActive();
        this.name = brothRequest.name();
        this.description = brothRequest.description();
        this.price = brothRequest.price();
    }
}
