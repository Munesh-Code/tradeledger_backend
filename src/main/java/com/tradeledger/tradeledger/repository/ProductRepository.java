package com.tradeledger.tradeledger.repository;

import com.tradeledger.tradeledger.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
