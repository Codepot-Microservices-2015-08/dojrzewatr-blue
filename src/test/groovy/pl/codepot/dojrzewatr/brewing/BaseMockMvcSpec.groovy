package pl.codepot.dojrzewatr.brewing
import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc
import pl.codepot.dojrzewatr.api.BrewingController
import spock.lang.Specification

abstract class BaseMockMvcSpec extends Specification {

    def setup() {
        RestAssuredMockMvc.standaloneSetup(new BrewingController())
    }

}
