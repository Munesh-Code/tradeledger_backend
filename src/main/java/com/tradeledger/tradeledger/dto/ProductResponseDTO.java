package com.tradeledger.tradeledger.dto;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Getter
@Builder
public class ProductResponseDTO {
    private UUID id;
    private String name;
    private String sku;
    private BigDecimal purchasePrice;
    private BigDecimal sellingPrice;
    private Integer stockQuantity;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant deletedAt;
}
