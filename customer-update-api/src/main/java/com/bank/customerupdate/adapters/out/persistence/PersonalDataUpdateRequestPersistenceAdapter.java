package com.bank.customerupdate.adapters.out.persistence;

import com.bank.customerupdate.adapters.out.persistence.entity.PersonalDataUpdateRequestJpaEntity;
import com.bank.customerupdate.adapters.out.persistence.repository.PersonalDataUpdateRequestJpaRepository;
import com.bank.customerupdate.application.port.out.SavePersonalDataUpdateRequestPort;
import com.bank.customerupdate.domain.model.PersonalDataUpdateRequest;
import com.bank.customerupdate.domain.model.UpdateRequestStatus;
import org.springframework.stereotype.Component;

@Component
public class PersonalDataUpdateRequestPersistenceAdapter implements SavePersonalDataUpdateRequestPort {

    private final PersonalDataUpdateRequestJpaRepository repository;

    public PersonalDataUpdateRequestPersistenceAdapter(
            PersonalDataUpdateRequestJpaRepository repository
    ) {
        this.repository = repository;
    }

    @Override
    public PersonalDataUpdateRequest save(PersonalDataUpdateRequest request) {
        PersonalDataUpdateRequestJpaEntity entity = new PersonalDataUpdateRequestJpaEntity();
        entity.setCustomerId(request.getCustomerId());
        entity.setAddress(request.getAddress());
        entity.setEmail(request.getEmail());
        entity.setPhone(request.getPhone());
        entity.setStatus(UpdateRequestStatus.PENDING.name());

        PersonalDataUpdateRequestJpaEntity savedEntity = repository.save(entity);

        return new PersonalDataUpdateRequest(
                savedEntity.getCustomerId(),
                savedEntity.getAddress(),
                savedEntity.getEmail(),
                savedEntity.getPhone()
        );
    }
}