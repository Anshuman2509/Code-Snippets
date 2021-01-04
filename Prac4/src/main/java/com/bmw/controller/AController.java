package com.bmw.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AController {
	@RequestMapping(path = "/about",method = RequestMethod.GET)
	public String about(Model model) {
		model.addAttribute("name","Jack Ryan");
		model.addAttribute("car","Mercedes AMG");
		return "about";
	}
	@RequestMapping(path="/car",method = RequestMethod.GET)
	public String info(Model model) {
		List<String> cars=List.of("Audi","BMW","Mercedes");
		model.addAttribute("name","Jack Ryan");
		model.addAttribute("cars",cars);
		return "info";
	}
	@RequestMapping(path = "/conditional",method = RequestMethod.GET)
	public String conditional(Model model) {
		model.addAttribute("isActive",true);
		model.addAttribute("gender",'M');
		List<Integer> integers=List.of(12,3,45,65,76,31,43);
		model.addAttribute("myList",integers);
		return "conditional";
	}
	@RequestMapping(path = "/include",method = RequestMethod.GET)
	public String includeTest(Model model) {
		model.addAttribute("name","Jack Ryan");
		model.addAttribute("age",34);
		return "includeTest";
	}
	@RequestMapping(path="/der1",method=RequestMethod.GET)
	public String der1() {
		return "derived1";
	}
	@RequestMapping(path = "/der2",method = RequestMethod.GET)
	public String der2() {
		return "derived2";
	}

}
