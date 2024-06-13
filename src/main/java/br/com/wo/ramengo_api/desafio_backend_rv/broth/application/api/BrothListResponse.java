package br.com.wo.ramengo_api.desafio_backend_rv.broth.application.api;

import br.com.wo.ramengo_api.desafio_backend_rv.broth.domain.Broth;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public record BrothListResponse(Integer id, String name, String description, BigDecimal price) {
    public BrothListResponse(Broth broth) {
        this(broth.getId(), broth.getName(), broth.getDescription(), broth.getPrice());
    }

    public static List<BrothListResponse> convert(List<Broth> broths) {
        return broths.stream()
                .map(BrothListResponse::new)
                .collect(Collectors.toList());
    }
}
