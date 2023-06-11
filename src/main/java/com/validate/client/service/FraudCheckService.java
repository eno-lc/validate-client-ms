package com.validate.client.service;

import com.validate.client.repository.FraudsterRepository;
import com.validate.client.request.ClientRequest;
import com.validate.client.response.FraudCheckResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FraudCheckService {

    private final FraudsterRepository fraudsterRepository;

    public FraudCheckResponse isFraudster(ClientRequest clientRequest) {

        String clientName = clientRequest.getClient();
        var fraudster = fraudsterRepository.findByClient(clientName);

        if (fraudster.isPresent()) {
            return new FraudCheckResponse(true);
        }
        return new FraudCheckResponse(false);
    }
}
