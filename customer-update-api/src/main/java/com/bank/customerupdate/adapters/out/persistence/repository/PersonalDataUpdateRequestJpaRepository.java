package com.bank.customerupdate.adapters.out.persistence.repository;

import com.bank.customerupdate.adapters.out.persistence.entity.PersonalDataUpdateRequestJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalDataUpdateRequestJpaRepository
        extends JpaRepository<PersonalDataUpdateRequestJpaEntity, Long> {
}