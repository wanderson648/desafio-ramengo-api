package br.com.wo.ramengo_api.desafio_backend_rv.protein.application.api;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProteinController implements ProteinAPI {

    private final Logger logger = LoggerFactory.getLogger(ProteinController.class);
    @Override
    public ProteinResponse createProtein(ProteinRequest proteinRequest) {
        logger.info("[start] ProteinController - createProtein");
        logger.info("[finished] ProteinController - createProtein");
        return null;
    }

    @Override
    public List<ProteinListResponse> listAllProtein() {
        logger.info("[start] ProteinController - listAllProtein");
        logger.info("[finished] ProteinController - listAllProtein");
        return null;
    }
}
