package com.tradeledger.tradeledger.service;

import com.tradeledger.tradeledger.dto.ProductRequestDTO;
import com.tradeledger.tradeledger.dto.ProductResponseDTO;
import com.tradeledger.tradeledger.entity.Product;
import com.tradeledger.tradeledger.exception.ProductAlreadyExistsException;
import com.tradeledger.tradeledger.exception.ProductNotFoundException;
import com.tradeledger.tradeledger.mapper.ProductMapper;
import com.tradeledger.tradeledger.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public ProductResponseDTO createProduct(ProductRequestDTO request) {
        if(productRepository.existsBySku(request.getSku())) {
            throw new ProductAlreadyExistsException("Product with this SKU already exists");
        }

        Product product = productMapper.toEntity(request);
        Product savedProduct = productRepository.save(product);
        return productMapper.toResponseDTO(savedProduct);
    }

    @Override
    public ProductResponseDTO updateProduct(UUID id, ProductRequestDTO request) {
        if(!productRepository.existsById(id)){
            throw new ProductNotFoundException("Product with id: " + id + "does not exists");
        }

        Product product = productMapper.toEntity(request);
        product.setId(id);
        Product updatedProduct = productRepository.save(product);
        return productMapper.toResponseDTO(updatedProduct);
    }

    @Override
    public List<ProductResponseDTO> getAllProducts() {
        List<ProductResponseDTO> responseList = new ArrayList<>();

        List<Product> productsList = productRepository.findAll();

        for(Product p: productsList) {
            responseList.add(productMapper.toResponseDTO(p));
        }

        return responseList;
    }

    @Override
    public void deleteProduct(UUID id) {
        if(!productRepository.existsById(id)) {
            throw new ProductNotFoundException("Product with id: " + id + "does not exists");
        }

        productRepository.deleteById(id);
    }



}
