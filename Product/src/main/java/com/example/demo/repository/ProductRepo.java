package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.product.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
	
//	@Query("FROM products")
//	public List<Product> getAllProduct();
//
//	@Query("SELECT u FROM products u WHERE u.reference = ?1")
//	public Product getProduct(Integer reference);
//	
//	@Modifying
//	@Query(value = "insert into products (reference, name) values (:name, :age)",nativeQuery = true)
//	void insertProduct(@Param("reference") Integer reference, @Param("name") String name);
//	
//	@Query("delete u FROM products u WHERE u.reference = ?1")
//	public void deleteProduct(Integer reference);
	
}
