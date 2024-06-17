package br.com.wo.ramengo_api.desafio_backend_rv.protein.application.api;


import br.com.wo.ramengo_api.desafio_backend_rv.protein.domain.Protein;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public record ProteinListResponse(Integer id, String imageInactive, String imageActive,String name, String description, BigDecimal price) {

    public ProteinListResponse(Protein protein) {
        this(protein.getId(), protein.getImageInactive(), protein.getImageActive(), protein.getName(), protein.getDescription(), protein.getPrice());
    }

    public static List<ProteinListResponse> convert(List<Protein> proteins) {
        return proteins.stream()
                .map(ProteinListResponse::new)
                .collect(Collectors.toList());
    }
}
