package pl.codepot.dojrzewatr.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.codepot.dojrzewatr.brewing.model.Ingredients;

@RestController
@RequestMapping(consumes = "application/vnd.some.service.v1+json", produces = MediaType.APPLICATION_JSON_VALUE)
public class BrewingController {

    @RequestMapping(value = "/brewing", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public void brewing(@RequestBody Ingredients ingredients) {

    }
}

