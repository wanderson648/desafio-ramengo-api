package br.com.wo.ramengo_api.desafio_backend_rv.protein.application.infra;

import br.com.wo.ramengo_api.desafio_backend_rv.protein.application.repository.ProteinRepository;
import br.com.wo.ramengo_api.desafio_backend_rv.protein.application.service.ProteinServiceImpl;
import br.com.wo.ramengo_api.desafio_backend_rv.protein.domain.Protein;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProteinRepositoryImpl implements ProteinRepository {
    private final Logger logger = LoggerFactory.getLogger(ProteinRepositoryImpl.class);

    private final ProteinSpringDataRepository proteinSpringDataRepository;
    @Override
    public Protein save(Protein protein) {
        logger.info("[start] ProteinRepositoryImpl - save");
        logger.info("[finished] ProteinRepositoryImpl - save");
        return proteinSpringDataRepository.save(protein);
    }

    @Override
    public List<Protein> listAll() {
        logger.info("[start] ProteinRepositoryImpl - listAll");
        logger.info("[finished] ProteinRepositoryImpl - listAll");
        return proteinSpringDataRepository.findAll();
    }
}
