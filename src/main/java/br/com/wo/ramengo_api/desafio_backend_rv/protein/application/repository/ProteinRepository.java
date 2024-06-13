package br.com.wo.ramengo_api.desafio_backend_rv.protein.application.repository;

import br.com.wo.ramengo_api.desafio_backend_rv.protein.domain.Protein;

import java.util.List;

public interface ProteinRepository {
    Protein save(Protein protein);
    List<Protein> listAll();
}
