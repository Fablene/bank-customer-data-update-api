package com.bank.customerupdate.adapters.in.rest;

import com.bank.customerupdate.adapters.in.rest.request.SubmitPersonalDataUpdateRequestHttpRequest;
import com.bank.customerupdate.application.port.in.SubmitPersonalDataUpdateRequestCommand;
import com.bank.customerupdate.application.port.in.SubmitPersonalDataUpdateRequestUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/update-requests")
public class PersonalDataUpdateRequestController {

    private final SubmitPersonalDataUpdateRequestUseCase submitPersonalDataUpdateRequestUseCase;

    public PersonalDataUpdateRequestController(
            SubmitPersonalDataUpdateRequestUseCase submitPersonalDataUpdateRequestUseCase
    ) {
        this.submitPersonalDataUpdateRequestUseCase = submitPersonalDataUpdateRequestUseCase;
    }

    @PostMapping
    public ResponseEntity<Void> submitUpdateRequest(
            @RequestBody SubmitPersonalDataUpdateRequestHttpRequest request
    ) {
        SubmitPersonalDataUpdateRequestCommand command =
                new SubmitPersonalDataUpdateRequestCommand(
                        request.getCustomerId(),
                        request.getAddress(),
                        request.getEmail(),
                        request.getPhone()
                );

        submitPersonalDataUpdateRequestUseCase.submitUpdateRequest(command);

        return ResponseEntity.ok().build();
    }
}