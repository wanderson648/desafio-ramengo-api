package br.com.wo.ramengo_api.desafio_backend_rv.broth.application.service;

import br.com.wo.ramengo_api.desafio_backend_rv.broth.application.api.BrothListResponse;
import br.com.wo.ramengo_api.desafio_backend_rv.broth.application.api.BrothRequest;
import br.com.wo.ramengo_api.desafio_backend_rv.broth.application.api.BrothResponse;
import br.com.wo.ramengo_api.desafio_backend_rv.broth.application.repository.BrothRepository;
import br.com.wo.ramengo_api.desafio_backend_rv.broth.domain.Broth;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BrothServiceImpl implements BrothService {
    private final Logger logger = LoggerFactory.getLogger(BrothServiceImpl.class);

    private final BrothRepository brothRepository;

    @Override
    public BrothResponse createBroth(BrothRequest brothRequest) {
        logger.info("[start] BrothServiceImpl - createBroth");
        Broth broth = brothRepository.save(new Broth(brothRequest));
        logger.info("[finished] BrothServiceImpl - createBroth");
        return BrothResponse.builder().id(broth.getId()).build();
    }

    @Override
    public List<BrothListResponse> listAllBroths() {
        logger.info("[start] BrothServiceImpl - listAllBroths");
        List<Broth> broths = brothRepository.listAll();
        logger.info("[finished] BrothServiceImpl - listAllBroths");
        return BrothListResponse.convert(broths);
    }
}
