package com.example.demo.model.product;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import com.example.demo.model.enums.CategoryProduct;
import com.example.demo.model.enums.TypeProduct;


public class ProductDetails {
	
	private String detailId;
	private TypeProduct typeProduct;
	private CategoryProduct categoryProduct;
	
	private String paysFabrique;
	private Date dateFabrique;
	public String getDetailId() {
		return detailId;
	}
	public void setDetailId(String detailId) {
		this.detailId = detailId;
	}
	public TypeProduct getTypeProduct() {
		return typeProduct;
	}
	public void setTypeProduct(TypeProduct typeProduct) {
		this.typeProduct = typeProduct;
	}
	public CategoryProduct getCategoryProduct() {
		return categoryProduct;
	}
	public void setCategoryProduct(CategoryProduct categoryProduct) {
		this.categoryProduct = categoryProduct;
	}
	public String getPaysFabrique() {
		return paysFabrique;
	}
	public void setPaysFabrique(String paysFabrique) {
		this.paysFabrique = paysFabrique;
	}
	public Date getDateFabrique() {
		return dateFabrique;
	}
	public void setDateFabrique(Date dateFabrique) {
		this.dateFabrique = dateFabrique;
	}
	
	

}
