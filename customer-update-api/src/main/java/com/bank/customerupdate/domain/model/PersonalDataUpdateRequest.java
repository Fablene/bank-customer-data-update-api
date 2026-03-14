package com.bank.customerupdate.domain.model;

import java.time.LocalDateTime;

public class PersonalDataUpdateRequest {

    private Long id;
    private final Long customerId;

    private String address;
    private String email;
    private String phone;

    private UpdateRequestStatus status;
    private LocalDateTime submittedAt;

    public PersonalDataUpdateRequest(
            Long customerId,
            String address,
            String email,
            String phone) {
        this.id = id;
        this.customerId = customerId;
        this.address = address;
        this.email = email;
        this.phone = phone;

        this.status = UpdateRequestStatus.PENDING;
        this.submittedAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
    public UpdateRequestStatus getStatus() {
        return status;
    }

    public void approve() {
        this.status = UpdateRequestStatus.APPROVED;
    }

    public void reject() {
        this.status = UpdateRequestStatus.REJECTED;
    }

    public void cancel() {
        this.status = UpdateRequestStatus.CANCELLED;
    }

}