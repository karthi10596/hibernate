package com.niit.dao.NIITEComBackEnd.Dao;

import java.util.List;

import javax.persistence.Entity;

import com.niit.NiitBackEnd.entity.Products;

@Entity

public interface ProductDao{
	
	List<Products> getAllProducts();
	
	Products getProductById(int id);
	
	void updateProductById(Products product);

}
