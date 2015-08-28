package pl.codepot.dojrzewatr.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.codepot.dojrzewatr.brewing.model.BrewRequest;

@Service
public class BrewService {

    private static final Logger logger = LoggerFactory.getLogger(BrewService.class);

    private ButelkatrService butelkatrService;
    private PrezentatorService prezentatorService;

    @Autowired
    public BrewService(ButelkatrService butelkatrService, PrezentatorService prezentatorService) {
        this.butelkatrService = butelkatrService;
        this.prezentatorService = prezentatorService;
    }

    public void handleBrewRequest(BrewRequest request) {
        prezentatorService.sendFeedToPrezentator();
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            logger.info("slee fail", e);
        }
        butelkatrService.bottle(9999);
    }




}
