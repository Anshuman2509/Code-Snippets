package com.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.bmw.Address;
import com.bmw.Student;
import com.merc.Person;

@Configuration
@ComponentScan(basePackages = {"com.audi"}) // Scan com.audi packages and automatically create beans based on annotations
@PropertySource("classpath:details.properties")
public class HelloConfig { 
	
	/* We can also create beans by using @bean annotation. The bean name would be method name.
	 * In case of dependency injection through constructor, just call the method while initializing
	 * 
	 */
	@Bean // Here the bean name is myAddress
	public Address myAddress() {
		return new Address();
	}
	@Bean //the bean name is myStudent with Address dependency injection
	public Student myStudent() {
		return new Student(myAddress());
	}
	@Bean
	public Person getPersonAnnotatedFromProperties() {
		return new Person();
	}

}
