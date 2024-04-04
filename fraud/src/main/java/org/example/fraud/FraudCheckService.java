package org.example.fraud;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class FraudCheckService {
    private final FraudCheckRepository fraudCheckRepository;

    public boolean isFraudelentCustomer(long customerId) {
        fraudCheckRepository.save(FraudCheckHistory.builder()
                .createdAt(LocalDateTime.now())
                .isFraudster(false)
                .customerId(customerId)
                .build());
        return false;
    }
}
