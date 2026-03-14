package com.bank.customerupdate.config;

import com.bank.customerupdate.application.port.in.SubmitPersonalDataUpdateRequestUseCase;
import com.bank.customerupdate.application.port.out.SavePersonalDataUpdateRequestPort;
import com.bank.customerupdate.application.service.SubmitPersonalDataUpdateRequestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public SubmitPersonalDataUpdateRequestUseCase submitPersonalDataUpdateRequestUseCase(
            SavePersonalDataUpdateRequestPort savePersonalDataUpdateRequestPort
    ) {
        return new SubmitPersonalDataUpdateRequestService(savePersonalDataUpdateRequestPort);
    }
}