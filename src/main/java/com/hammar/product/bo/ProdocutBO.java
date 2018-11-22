package com.hammar.product.bo;

import com.hammar.product.dto.Product;

public interface ProdocutBO {
	
	public void create(Product product);
	
	public Product findProduct(int id);

}
