package com.niit.dao.NIITEComBackEnd;

import org.junit.*;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.niit.dao.NIITEComBackEnd.Dao.ProductDao;

import com.niit.dao.NIITEComBackEnd.Dao.ProductDaoImpl;


@SpringBootApplication

public class NiiteComBackEndApplicationTests implements CommandLineRunner {

	
public static void main(String[] args) {
	
SpringApplication.run(NiiteComBackEndApplicationTests.class, args);
	}

	@Autowired
	
private ProductDao articleDAO;

	@Autowired
	
	ProductDaoImpl Dao;
	
@Override
	
public void run(String... arg0) throws Exception {


		System.out.println("*******************"+articleDAO.getAllProducts().size());

		
		System.out.println("^^^^^^^^^^^^"+Dao.getAllProducts().size());

		
	
}
}

	

