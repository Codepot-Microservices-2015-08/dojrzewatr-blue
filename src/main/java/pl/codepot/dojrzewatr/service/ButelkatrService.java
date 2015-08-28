package pl.codepot.dojrzewatr.service;

import com.nurkiewicz.asyncretry.RetryExecutor;
import com.ofg.infrastructure.discovery.ServiceAlias;
import com.ofg.infrastructure.web.resttemplate.fluent.ServiceRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.codepot.dojrzewatr.brewing.model.Wort;

@Service
public class ButelkatrService {
    private final ServiceRestClient serviceRestClient;
    private final RetryExecutor retryExecutor;

    @Autowired
    public ButelkatrService(ServiceRestClient serviceRestClient, RetryExecutor retryExecutor) {
        this.serviceRestClient = serviceRestClient;
        this.retryExecutor = retryExecutor;
    }

    public void bottle(int bottles) {
        Wort wort = new Wort(bottles);
        serviceRestClient.forService(new ServiceAlias("butelkatr"))
                .retryUsing(retryExecutor)
                .post()
                .onUrl("/bottle")
                .body(wort)
                .withHeaders().contentType("application/vnd.pl.codepot.butelkatr.v1+json")
                .andExecuteFor()
                .ignoringResponse();
    }
}
