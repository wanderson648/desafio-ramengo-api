package br.com.wo.ramengo_api.desafio_backend_rv.broth.application.api;

import br.com.wo.ramengo_api.desafio_backend_rv.broth.application.service.BrothService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class BrothController implements BrothAPI {

    private final Logger logger = LoggerFactory.getLogger(BrothController.class);

    private final BrothService brothService;

//    @Override
//    public BrothResponse createBroth(BrothRequest brothRequest) {
//        logger.info("[start] BrothController - createBroth");
//        logger.info("[finished] BrothController - createBroth");
//        return brothService.createBroth(brothRequest);
//    }

    @Override
    public List<BrothListResponse> listAllBroths(String apiKey) {
        logger.info("[start] BrothController - listAllBroths");
        List<BrothListResponse> broths = brothService.listAllBroths(apiKey);
        logger.info("[finished] BrothController - listAllBroths");
        return broths;
    }
}
