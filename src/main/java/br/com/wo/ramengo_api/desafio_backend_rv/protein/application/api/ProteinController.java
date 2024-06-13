package br.com.wo.ramengo_api.desafio_backend_rv.protein.application.api;

import br.com.wo.ramengo_api.desafio_backend_rv.protein.application.service.ProteinService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProteinController implements ProteinAPI {
    private final Logger logger = LoggerFactory.getLogger(ProteinController.class);

    private final ProteinService proteinService;
    @Override
    public ProteinResponse createProtein(ProteinRequest proteinRequest) {
        logger.info("[start] ProteinController - createProtein");
        logger.info("[finished] ProteinController - createProtein");
        return proteinService.createProtein(proteinRequest);
    }

    @Override
    public List<ProteinListResponse> listAllProtein() {
        logger.info("[start] ProteinController - listAllProtein");
        List<ProteinListResponse> proteins = proteinService.listAllProteins();
        logger.info("[finished] ProteinController - listAllProtein");
        return proteins;
    }
}
