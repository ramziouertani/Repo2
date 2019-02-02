package com.example.demo.service;

import java.util.List;

import com.example.demo.exception.ProductException;
import com.example.demo.model.product.Product;

public interface IProductService {
	
	public List<Product> getProducts()  throws ProductException;
	public Product getProduct(Integer reference)  throws ProductException;
	public Product addProduct(Product product)  throws ProductException;
	public Boolean existProduct(Product product)  throws ProductException;
	public void deleteProduct(Integer reference) throws ProductException;
	public void deleteAllProduct() throws ProductException;

}
