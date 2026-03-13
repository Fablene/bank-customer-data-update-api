package com.bank.customerupdate.application.port.in;

public class SubmitPersonalDataUpdateRequestCommand {
    private final Long customerId;
    private final String address;
    private final String email;
    private final String phone;

    public SubmitPersonalDataUpdateRequestCommand(
            Long customerId,
            String address,
            String email,
            String phone
    ) {
        this.customerId = customerId;
        this.address = address;
        this.email = email;
        this.phone = phone;
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
}
