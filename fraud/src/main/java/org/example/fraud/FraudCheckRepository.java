package org.example.fraud;

import org.example.fraud.model.FraudCheckHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudCheckRepository extends JpaRepository<FraudCheckHistory, Long> {

}
