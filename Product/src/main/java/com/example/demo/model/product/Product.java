package com.example.demo.model.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="reference", updatable = false, nullable = false)
	private Integer reference;
	
	@Column(name="name")
	private String name;
	
	public Integer getReference() {
		return reference;
	}
	public void setReference(Integer reference) {
		this.reference = reference;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
