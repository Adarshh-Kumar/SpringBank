package com.example.SpringBank.api.v1.request.customer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import jakarta.validation.constraints.NotNull; // UPDATED: Changed from javax to jakarta
import jakarta.validation.constraints.NotEmpty;

/**
 * Updated for Java 21 and Spring Boot 3.4.4
 */
@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateCustomerRequest {

    @NotNull(message = "{constraints.NotEmpty.message}")
    private String name;

    @NotNull(message = "{constraints.NotEmpty.message}")
    private String ssn;

    private String address1;
    private String address2;
    private String city;
    private String contactNumber;
}