package com.validate.client.response;

import lombok.Builder;

@Builder
public record FraudCheckResponse(Boolean isFraudster) {
}
