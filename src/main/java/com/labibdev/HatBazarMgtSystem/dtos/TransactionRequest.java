package com.labibdev.HatBazarMgtSystem.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.labibdev.HatBazarMgtSystem.enums.TransactionStatus;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionRequest {

    @Positive(message = "Product id is required")
    private Long productId;

    @Positive(message = "quantity id is required")
    private Integer quantity;


    private Long supplierId;

    private String description;

    private String note;

}
