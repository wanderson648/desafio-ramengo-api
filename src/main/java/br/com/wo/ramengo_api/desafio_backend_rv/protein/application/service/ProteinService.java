package br.com.wo.ramengo_api.desafio_backend_rv.protein.application.service;

import br.com.wo.ramengo_api.desafio_backend_rv.protein.application.api.ProteinListResponse;
import br.com.wo.ramengo_api.desafio_backend_rv.protein.application.api.ProteinRequest;
import br.com.wo.ramengo_api.desafio_backend_rv.protein.application.api.ProteinResponse;

import java.util.List;

public interface ProteinService {
    ProteinResponse createProtein(ProteinRequest proteinRequest);
    List<ProteinListResponse> listAllProteins(String apiKey);
}
