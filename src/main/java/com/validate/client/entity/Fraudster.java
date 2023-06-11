package com.validate.client.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "fraudsters")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Fraudster {

    @Id
    private Long id;

    private String client;

}
