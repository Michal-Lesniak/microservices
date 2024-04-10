package org.example.fraud;

import com.example.clients.fraud.FraudCheckResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/fraud-check")
public class FraudCheckController {

    private final FraudCheckService fraudCheckService;

    @GetMapping("{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") long customerId){
        boolean isFraudulentCustomer = fraudCheckService.isFraudelentCustomer(customerId);
        return new FraudCheckResponse(isFraudulentCustomer);
    }
}
