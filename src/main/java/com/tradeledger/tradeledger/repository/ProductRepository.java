package com.tradeledger.tradeledger.repository;

import com.tradeledger.tradeledger.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
    boolean existsBySku(String sku);

}
