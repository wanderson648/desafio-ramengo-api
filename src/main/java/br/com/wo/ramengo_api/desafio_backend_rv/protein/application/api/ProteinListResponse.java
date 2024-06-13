package br.com.wo.ramengo_api.desafio_backend_rv.protein.application.api;


import java.math.BigDecimal;

public record ProteinListResponse(Integer id, String name, String description, BigDecimal price) {

}
