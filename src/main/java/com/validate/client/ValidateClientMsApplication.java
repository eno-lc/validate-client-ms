package com.validate.client;

import com.validate.client.entity.Fraudster;
import com.validate.client.repository.FraudsterRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ValidateClientMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ValidateClientMsApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(FraudsterRepository fraudsterRepository) {
        return args -> {
            fraudsterRepository.save(new Fraudster(1L, "Avdi"));
        };
    }

}
