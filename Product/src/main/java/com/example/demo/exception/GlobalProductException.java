package com.example.demo.exception;

import javax.persistence.EntityNotFoundException;
import javax.validation.ConstraintViolationException;

import org.springframework.beans.TypeMismatchException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
//import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.example.demo.model.product.ErrorProduct;


@RestControllerAdvice
public class GlobalProductException {

	@ExceptionHandler(value = {ProductException.class })
	public ResponseEntity<?> unknownException(ProductException ex) {

		ErrorProduct errorProduct = new ErrorProduct();
		
		errorProduct.setStatus(HttpStatus.BAD_REQUEST);
		errorProduct.setMessage("server error");
	  	errorProduct.setCode(500);
			
		return new ResponseEntity<ErrorProduct>(errorProduct,HttpStatus.BAD_REQUEST);
	}
	
	   @ExceptionHandler(EntityNotFoundException.class)
	   protected ResponseEntity<?> handleEntityNotFound(EntityNotFoundException ex) {
			ErrorProduct errorProduct = new ErrorProduct();

			errorProduct.setStatus(HttpStatus.BAD_REQUEST);
			errorProduct.setMessage("entity not found");
		  	errorProduct.setCode(420);
		  	return new ResponseEntity<>(errorProduct,HttpStatus.BAD_REQUEST);	  
	}
	   
	   @ExceptionHandler(DataIntegrityViolationException.class)
	   protected ResponseEntity<?> constraintViolationException(DataIntegrityViolationException  ex) {
			ErrorProduct errorProduct = new ErrorProduct();

			errorProduct.setStatus(HttpStatus.BAD_REQUEST);
			errorProduct.setMessage("violation contraint");
		  	errorProduct.setCode(410);
		  	return new ResponseEntity<>(errorProduct,HttpStatus.BAD_REQUEST);	  
	}
	   
	   @ExceptionHandler(MethodArgumentTypeMismatchException.class)
	   protected ResponseEntity<?> handleMethodArgumentTypeMismatch(MethodArgumentTypeMismatchException ex) {
			ErrorProduct errorProduct = new ErrorProduct();

			errorProduct.setStatus(HttpStatus.BAD_REQUEST);
			errorProduct.setMessage("type error");
		  	errorProduct.setCode(430);
		  	return new ResponseEntity<>(errorProduct,HttpStatus.BAD_REQUEST);	  
	}
	   
//	   @ExceptionHandler(HttpMessageNotReadableException.class)
//	   protected ResponseEntity<?> handleHttpMessageNotReadable(HttpMessageNotReadableException ex) {
//			ErrorProduct errorProduct = new ErrorProduct();
//
//			errorProduct.setStatus(HttpStatus.BAD_REQUEST);
//			errorProduct.setMessage("verifiy the path api");
//		  	errorProduct.setCode(440);
//		  	return new ResponseEntity<>(errorProduct,HttpStatus.BAD_REQUEST);	  
//	}
	   
	   @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	   protected ResponseEntity<?> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex) {
			ErrorProduct errorProduct = new ErrorProduct();

			errorProduct.setStatus(HttpStatus.BAD_REQUEST);
			errorProduct.setMessage("Method Not Supported");
		  	errorProduct.setCode(450);
		  	return new ResponseEntity<>(errorProduct,HttpStatus.BAD_REQUEST);	  
	}
	   
	   @ExceptionHandler(MethodArgumentNotValidException.class)
	   protected ResponseEntity<?> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
			ErrorProduct errorProduct = new ErrorProduct();

			errorProduct.setStatus(HttpStatus.BAD_REQUEST);
			errorProduct.setMessage("invalid argument");
		  	errorProduct.setCode(470);
		  	return new ResponseEntity<>(errorProduct,HttpStatus.BAD_REQUEST);	  
	}
	   
	   @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
	   protected ResponseEntity<?> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex) {
			ErrorProduct errorProduct = new ErrorProduct();

			errorProduct.setStatus(HttpStatus.BAD_REQUEST);
			errorProduct.setMessage("Media Type Not Supported");
		  	errorProduct.setCode(460);
		  	return new ResponseEntity<>(errorProduct,HttpStatus.BAD_REQUEST);	  
	}
	   
	   @ExceptionHandler(TypeMismatchException.class)
	   protected ResponseEntity<?> handleTypeMismatchException(TypeMismatchException ex) {
			ErrorProduct errorProduct = new ErrorProduct();

			errorProduct.setStatus(HttpStatus.BAD_REQUEST);
			errorProduct.setMessage("error Type bean");
		  	errorProduct.setCode(480);
		  	return new ResponseEntity<>(errorProduct,HttpStatus.BAD_REQUEST);	  
	}
	   
	   
}
