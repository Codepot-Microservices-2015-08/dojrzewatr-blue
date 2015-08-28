package pl.codepot.dojrzewatr.service;

import com.google.common.util.concurrent.ListenableFuture;
import com.nurkiewicz.asyncretry.RetryExecutor;
import com.ofg.infrastructure.web.resttemplate.fluent.ServiceRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrezentatorService {

    private final ServiceRestClient serviceRestClient;
    private final RetryExecutor retryExecutor;

    @Autowired
    public PrezentatorService(ServiceRestClient serviceRestClient, RetryExecutor retryExecutor) {
        this.serviceRestClient = serviceRestClient;
        this.retryExecutor = retryExecutor;
    }


    public ListenableFuture<Void> sendFeedToPrezentator() {
        return serviceRestClient.forService("prezentatr")
            .retryUsing(retryExecutor)
            .put()
//            .withCircuitBreaker(withGroupKey(asKey("hystrix_group")))
            .onUrl("/feed/dojrzewatr")
            .withoutBody()
            .withHeaders().contentType("application/vnd.pl.codepot.prezentatr.v1+json")
            .andExecuteFor()
            .ignoringResponseAsync();
    }



}
