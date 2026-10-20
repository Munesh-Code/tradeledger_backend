package com.tradeledger.tradeledger.controller;

import com.tradeledger.tradeledger.dto.ProductRequest;
import com.tradeledger.tradeledger.dto.ProductResponse;
import com.tradeledger.tradeledger.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductResponse> createProduct(@Valid @RequestBody ProductRequest request) {
        ProductResponse response = null;
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
