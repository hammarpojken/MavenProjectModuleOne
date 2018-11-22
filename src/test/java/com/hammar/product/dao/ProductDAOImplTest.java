package com.hammar.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hammar.product.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void createShouldCreatProduct() {
		
		ProductDAO dao = new ProductDAOImpl(); 
		Product product = new Product();
		
		product.setId(1);
		product.setName("Rubber band");
		product.setPrice(200);
		product.setDescription("Awesome product");
		
		dao.create(product);
		
		Product result = dao.read(1);
		
		assertNotNull(result);
		assertEquals("Rubber band", result.getName());
	}

}
