package com.tradeledger.tradeledger.dto;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
public class ProductResponse {
    private Long id;
    private String name;
    private String sku;
    private BigDecimal purchasePrice;
    private BigDecimal sellingPrice;
    private Integer stockQuantity;
    private Instant createdAt;
    private Instant deletedAt;
}
