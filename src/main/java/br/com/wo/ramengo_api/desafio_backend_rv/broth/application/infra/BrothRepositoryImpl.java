package br.com.wo.ramengo_api.desafio_backend_rv.broth.application.infra;


import br.com.wo.ramengo_api.desafio_backend_rv.broth.application.repository.BrothRepository;
import br.com.wo.ramengo_api.desafio_backend_rv.broth.domain.Broth;
import br.com.wo.ramengo_api.desafio_backend_rv.exception.handler.APIException;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BrothRepositoryImpl implements BrothRepository {

    @Value("${x-api-key}")
    private String xApiKey;

    private final Logger logger = LoggerFactory.getLogger(BrothRepositoryImpl.class);

    private final BrothSpringJpaRepository brothSpringJpaRepository;

    @Override
    public Broth save(Broth broth) {
        logger.info("[start] BrothRepositoryImpl - save");
        logger.info("[finished] BrothRepositoryImpl - save");
        return brothSpringJpaRepository.save(broth);
    }

    @Override
    public List<Broth> listAll(String apiKey) {
        if (!(apiKey.equals(xApiKey)) || apiKey.equals(" "))
            throw APIException.build(HttpStatus.FORBIDDEN, "x-api-key header missing");
        logger.info("[start] BrothRepositoryImpl - listAll");
        return brothSpringJpaRepository.findAll();
    }

}
