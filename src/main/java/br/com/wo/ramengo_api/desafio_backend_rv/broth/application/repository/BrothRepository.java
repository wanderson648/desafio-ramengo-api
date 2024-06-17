package br.com.wo.ramengo_api.desafio_backend_rv.broth.application.repository;

import br.com.wo.ramengo_api.desafio_backend_rv.broth.domain.Broth;

import java.util.List;

public interface BrothRepository {
    Broth save(Broth broth);
    List<Broth> listAll(String apiKey);
}
