package com.bank.customerupdate.application.service;

import com.bank.customerupdate.application.port.in.SubmitPersonalDataUpdateRequestCommand;
import com.bank.customerupdate.application.port.in.SubmitPersonalDataUpdateRequestUseCase;
import com.bank.customerupdate.application.port.out.SavePersonalDataUpdateRequestPort;
import com.bank.customerupdate.domain.model.PersonalDataUpdateRequest;

public class SubmitPersonalDataUpdateRequestService implements SubmitPersonalDataUpdateRequestUseCase {

    private final SavePersonalDataUpdateRequestPort savePersonalDataUpdateRequestPort;

    public SubmitPersonalDataUpdateRequestService(
            SavePersonalDataUpdateRequestPort savePersonalDataUpdateRequestPort
    ) {
        this.savePersonalDataUpdateRequestPort = savePersonalDataUpdateRequestPort;
    }

    @Override
    public void submitUpdateRequest(SubmitPersonalDataUpdateRequestCommand command) {
        PersonalDataUpdateRequest request = new PersonalDataUpdateRequest(
                command.getCustomerId(),
                command.getAddress(),
                command.getEmail(),
                command.getPhone()
        );

        savePersonalDataUpdateRequestPort.save(request);
    }
}
