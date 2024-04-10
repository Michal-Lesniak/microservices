package org.example.fraud;

import com.example.clients.fraud.FraudCheckResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/fraud-check")
public class FraudCheckController {

    private final FraudCheckService fraudCheckService;

    @GetMapping("{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") long customerId){
        boolean isFraudulentCustomer = fraudCheckService.isFraudelentCustomer(customerId);
        log.info("fraud checked");

        return new FraudCheckResponse(isFraudulentCustomer);
    }
}
