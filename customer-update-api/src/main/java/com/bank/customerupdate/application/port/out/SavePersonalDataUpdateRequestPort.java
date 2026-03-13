package com.bank.customerupdate.application.port.out;

import com.bank.customerupdate.domain.model.PersonalDataUpdateRequest;

public interface SavePersonalDataUpdateRequestPort {
    PersonalDataUpdateRequest save(PersonalDataUpdateRequest request);
}
