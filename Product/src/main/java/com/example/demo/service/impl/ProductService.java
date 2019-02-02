package com.example.demo.service.impl;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.exception.ProductException;
import com.example.demo.model.product.Product;
import com.example.demo.repository.ProductRepo;
import com.example.demo.service.IProductService;

@Service
public class ProductService implements IProductService{
	
	@Autowired
	ProductRepo productRepo;
	
	ProductService(ProductRepo productRepo){
		this.productRepo = productRepo;
	}
    @Override
	public List<Product> getProducts() throws ProductException{		
		return productRepo.findAll();
	}
    @Override
	public Product getProduct(Integer reference){	
		return productRepo.getOne(reference);
		
	}
    @Override
	@Transactional(value ="Propagation.REQUIRED")
	public Product addProduct(Product product)  throws ProductException{
		
	    return productRepo.save(product);		
	}
    @Override	
	public Boolean existProduct(Product product)  throws ProductException{		
		if(productRepo.findAll().isEmpty())
			return false;
		else 
			return true;	
	}
    @Override
	public void deleteProduct(Integer reference) throws ProductException {
		productRepo.deleteById(reference);
	}
    @Override
	public void deleteAllProduct() throws ProductException {
		productRepo.deleteAll();
	}
	
}
