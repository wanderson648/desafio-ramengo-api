package br.com.wo.ramengo_api.desafio_backend_rv.protein.application.service;

import br.com.wo.ramengo_api.desafio_backend_rv.protein.application.api.ProteinController;
import br.com.wo.ramengo_api.desafio_backend_rv.protein.application.api.ProteinListResponse;
import br.com.wo.ramengo_api.desafio_backend_rv.protein.application.api.ProteinRequest;
import br.com.wo.ramengo_api.desafio_backend_rv.protein.application.api.ProteinResponse;
import br.com.wo.ramengo_api.desafio_backend_rv.protein.application.repository.ProteinRepository;
import br.com.wo.ramengo_api.desafio_backend_rv.protein.domain.Protein;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProteinServiceImpl implements ProteinService {

    private final Logger logger = LoggerFactory.getLogger(ProteinServiceImpl.class);

    private final ProteinRepository proteinRepository;

    @Override
    public ProteinResponse createProtein(ProteinRequest proteinRequest) {
        logger.info("[start] ProteinServiceImpl - createProtein");
        Protein protein = proteinRepository.save(new Protein(proteinRequest));
        logger.info("[start] ProteinServiceImpl - createProtein");
        return ProteinResponse.builder().id(protein.getId()).build();
    }

    @Override
    public List<ProteinListResponse> listAllProteins() {
        logger.info("[start] ProteinServiceImpl - listAllProteins");
        List<Protein> proteins = proteinRepository.listAll();
        logger.info("[start] ProteinServiceImpl - listAllProteins");
        return ProteinListResponse.convert(proteins);
    }
}
