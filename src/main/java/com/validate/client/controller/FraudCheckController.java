package com.validate.client.controller;


import com.validate.client.request.ClientRequest;
import com.validate.client.response.FraudCheckResponse;
import com.validate.client.service.FraudCheckService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/fraud-check-client")
@RequiredArgsConstructor
public class FraudCheckController {

    private final FraudCheckService fraudCheckService;
    @PostMapping
    public FraudCheckResponse isFraudster(@RequestBody ClientRequest clientRequest) {
        return fraudCheckService.isFraudster(clientRequest);
    }

}
