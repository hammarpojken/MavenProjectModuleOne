package com.hammar.product.bo;

import com.hammar.product.dao.ProductDAO;
import com.hammar.product.dto.Product;

public class ProductBOImpl implements ProdocutBO {

	private ProductDAO dao;

	@Override
	public void create(Product product) {
		dao.create(product);

	}

	@Override
	public Product findProduct(int id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	public ProductDAO getDao() {
		return dao;
	}

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

}
