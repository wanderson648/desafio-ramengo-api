package br.com.wo.ramengo_api.desafio_backend_rv.broth.application.infra;


import br.com.wo.ramengo_api.desafio_backend_rv.broth.application.repository.BrothRepository;
import br.com.wo.ramengo_api.desafio_backend_rv.broth.domain.Broth;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BrothRepositoryImpl implements BrothRepository {
    private final Logger logger = LoggerFactory.getLogger(BrothRepositoryImpl.class);

    private final BrothSpringJpaRepository brothSpringJpaRepository;

    @Override
    public Broth save(Broth broth) {
        logger.info("[start] BrothRepositoryImpl - save");
        logger.info("[finished] BrothRepositoryImpl - save");
        return brothSpringJpaRepository.save(broth);
    }

    @Override
    public List<Broth> listAll() {
        logger.info("[start] BrothRepositoryImpl - listAll");
        logger.info("[finished] BrothRepositoryImpl - listAll");
        return brothSpringJpaRepository.findAll();
    }

}
