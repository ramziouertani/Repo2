package com.example.demo.model.product;

import org.springframework.http.HttpStatus;

public class ErrorProduct {

	private HttpStatus status;
	private String message;
	private Integer code;	
	
	public ErrorProduct() {
	}	
	public ErrorProduct(HttpStatus status,String message,Integer code) {
		this.status = status;
		this.message = message;
		this.code = code;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	
	
	
}
