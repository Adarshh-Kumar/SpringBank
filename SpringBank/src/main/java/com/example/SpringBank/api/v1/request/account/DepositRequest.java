package com.example.SpringBank.api.v1.request.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import jakarta.validation.constraints.NotNull; // UPDATED: Changed from javax to jakarta
import java.math.BigDecimal;

/**
 * Updated for Java 21 and Spring Boot 3.4.4
 */
@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class DepositRequest {

    @NotNull(message = "{constraints.NotEmpty.message}")
    private Long accountNumber;

    @NotNull(message = "{constraints.NotEmpty.message}")
    private BigDecimal depositAmt;
}