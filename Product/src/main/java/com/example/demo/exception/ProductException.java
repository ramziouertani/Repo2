package com.example.demo.exception;

import com.example.demo.model.product.ErrorProduct;

public class ProductException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ErrorProduct errorProduct;
	
	public ProductException(ErrorProduct errorProduct){
		super(errorProduct.getMessage());
		this.errorProduct = errorProduct;		
	}

	public ErrorProduct getErrorProduct() {
		return errorProduct;
	}

	public void setErrorProduct(ErrorProduct errorProduct) {
		this.errorProduct = errorProduct;
	}

	
	

}
