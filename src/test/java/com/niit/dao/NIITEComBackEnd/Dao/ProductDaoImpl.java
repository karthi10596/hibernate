package com.niit.dao.NIITEComBackEnd.Dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.niit.NiitBackEnd.entity.Products;


@Entity
@Repository
@Transactional
public class ProductDaoImpl implements ProductDao{
	
	@PersistenceContext	
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Products> getAllProducts() {
		
		String hql = "FROM Products as products ORDER BY products.id";
		return (List<Products>) entityManager.createQuery(hql).getResultList();
		
	}

	@Override
	public Products getProductById(int id) {
		Products product= entityManager.find(Products.class, 1);
		return product;
	}

	@Override
	public void updateProductById(Products product) {
		entityManager.merge(product);
		
	}

}
