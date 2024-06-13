package br.com.wo.ramengo_api.desafio_backend_rv.protein.application.service;

import br.com.wo.ramengo_api.desafio_backend_rv.protein.application.api.ProteinController;
import br.com.wo.ramengo_api.desafio_backend_rv.protein.application.api.ProteinListResponse;
import br.com.wo.ramengo_api.desafio_backend_rv.protein.application.api.ProteinRequest;
import br.com.wo.ramengo_api.desafio_backend_rv.protein.application.api.ProteinResponse;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProteinServiceImpl implements ProteinService {

    private final Logger logger = LoggerFactory.getLogger(ProteinServiceImpl.class);

    @Override
    public ProteinResponse createProtein(ProteinRequest proteinRequest) {
        logger.info("[start] ProteinServiceImpl - createProtein");
        logger.info("[start] ProteinServiceImpl - createProtein");
        return null;
    }

    @Override
    public List<ProteinListResponse> listAllProteins() {
        logger.info("[start] ProteinServiceImpl - listAllProteins");
        logger.info("[start] ProteinServiceImpl - listAllProteins");
        return null;
    }
}
