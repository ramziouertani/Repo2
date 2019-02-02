package com.example.demo.api;

import java.sql.SQLIntegrityConstraintViolationException;

import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.ProductException;
import com.example.demo.model.product.Product;
import com.example.demo.service.impl.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	ProductController(ProductService productService){
		this.productService = productService;
	}
	
	@GetMapping("/products")
	public ResponseEntity<?> getProduct() throws ProductException{
		return new ResponseEntity<>(productService.getProducts(),HttpStatus.ACCEPTED);		
	}
	
	@PostMapping("/product")
	public Product addProduct(@RequestBody(required = false) Product product) throws ProductException{

		return productService.addProduct(product);				
	}
	
	@GetMapping("/product/{reference}")
	public ResponseEntity<?> getProductId(@PathVariable Integer reference) throws ProductException{
		
		return new ResponseEntity<>(productService.getProduct(reference),HttpStatus.ACCEPTED);
	}
}
