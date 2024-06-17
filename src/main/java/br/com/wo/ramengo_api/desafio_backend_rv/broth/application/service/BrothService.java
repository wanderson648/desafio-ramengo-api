package br.com.wo.ramengo_api.desafio_backend_rv.broth.application.service;

import br.com.wo.ramengo_api.desafio_backend_rv.broth.application.api.BrothListResponse;
import br.com.wo.ramengo_api.desafio_backend_rv.broth.application.api.BrothRequest;
import br.com.wo.ramengo_api.desafio_backend_rv.broth.application.api.BrothResponse;

import java.util.List;

public interface BrothService {
    BrothResponse createBroth(BrothRequest brothRequest);
    List<BrothListResponse> listAllBroths(String apiKey);
}
