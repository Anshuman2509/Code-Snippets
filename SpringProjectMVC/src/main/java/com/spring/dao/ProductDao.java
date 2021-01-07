package com.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.entity.Product;

@Repository
public class ProductDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Transactional
	public void saveProduct(Product product) {
		hibernateTemplate.saveOrUpdate(product);
	}
	
	public List<Product> getAllProducts() {
		return hibernateTemplate.loadAll(Product.class);
	}
	
	public Product getProductById(int productId) {
		return hibernateTemplate.get(Product.class, productId);
	}
    @Transactional
	public void deleteProduct(int productId) {
		Product product=hibernateTemplate.load(Product.class, productId);
		hibernateTemplate.delete(product);
	}
}
