package com.validate.client.request;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ClientRequest {
    private String client;
    private double amount;
    private String status;
    private LocalDate date;
}
