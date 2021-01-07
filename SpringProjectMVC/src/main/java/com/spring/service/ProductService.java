package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.ProductDao;
import com.spring.entity.Product;

@Service
public class ProductService {
	@Autowired
	private ProductDao dao;
	
	public void saveProduct(Product product) {
		dao.saveProduct(product);
	}
	
	public Product getProductByid(int productId) {
		return dao.getProductById(productId);
	}
	
	public List<Product> getAllProducts(){
		return dao.getAllProducts();
	}
	
	public void deleteProduct(int productId) {
		dao.deleteProduct(productId);
	}

}
