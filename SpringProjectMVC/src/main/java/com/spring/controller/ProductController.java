package com.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.spring.entity.Product;
import com.spring.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/")
	public String home(Model model) {
		List<Product> products=productService.getAllProducts();
		model.addAttribute("products",products);
		return "index";
	}
	@RequestMapping("/addProduct")
	public String addProduct(Model model) {
		model.addAttribute("title","Add Product");
		return "addProduct";
	}
	@RequestMapping(path="/handleProduct",method = RequestMethod.POST)
	public RedirectView name(@ModelAttribute Product product,HttpServletRequest request) {
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath());
		
		productService.saveProduct(product);
		return redirectView;
	}

	@RequestMapping("/delete/{id}")
	public RedirectView deleteProduct(@PathVariable("id")int productId,HttpServletRequest request) {
		productService.deleteProduct(productId);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath());
		return redirectView;
	}
	@RequestMapping("/update/{id}")
	public String updateProduct(@PathVariable("id")int productId,Model model) {
		Product product=productService.getProductByid(productId);
		model.addAttribute("product",product);
		return "updateProduct";
	}
}
