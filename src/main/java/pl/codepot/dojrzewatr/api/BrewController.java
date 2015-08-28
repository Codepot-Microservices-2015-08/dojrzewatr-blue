package pl.codepot.dojrzewatr.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.codepot.dojrzewatr.brewing.model.BrewRequest;
import pl.codepot.dojrzewatr.service.BrewService;

@RestController
@RequestMapping(value = "/brew", consumes = "application/vnd.pl.codepot.dojrzewatr.v1+json", produces = MediaType.APPLICATION_JSON_VALUE)
public class BrewController {

    private static final Logger logger = LoggerFactory.getLogger(BrewController.class);

    private BrewService brewService;

    @Autowired
    public BrewController(BrewService brewService) {
        this.brewService = brewService;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public void brew(@RequestBody BrewRequest brewRequest) {
        logger.info("Test hit blue dojrzewator");
        brewService.handleBrewRequest(brewRequest);
    }


}