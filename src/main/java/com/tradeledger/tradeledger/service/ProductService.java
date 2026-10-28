package com.tradeledger.tradeledger.service;

import com.tradeledger.tradeledger.dto.ProductRequestDTO;
import com.tradeledger.tradeledger.dto.ProductResponseDTO;

import java.util.List;
import java.util.UUID;

public interface ProductService {
    ProductResponseDTO createProduct(ProductRequestDTO request);
    ProductResponseDTO updateProduct(UUID id, ProductRequestDTO request);
    List<ProductResponseDTO> getAllProducts();
    void deleteProduct(UUID id);
}
