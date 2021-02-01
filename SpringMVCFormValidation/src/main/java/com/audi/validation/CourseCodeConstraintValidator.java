package com.audi.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{
	
	private String courseValue;

	@Override
	public void initialize(CourseCode courseCode) {
		//getting the value of 'value' in CourseCode annotation
		this.courseValue=courseCode.value();
		
	}
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
	    //checking whether value passed is equal to the 'value' of CourseCode annotation
		boolean isCorrect=value.startsWith(courseValue);
		return isCorrect;
	}

}
