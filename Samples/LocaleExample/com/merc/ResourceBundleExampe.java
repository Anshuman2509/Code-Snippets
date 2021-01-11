package com.merc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExampe {
	public static void main(String[] args) {
		Locale franceLocale=new Locale("fr","FR");
		Date date=new Date();
		DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.LONG, franceLocale);
		System.out.println(dateFormat.format(date));
		
		ResourceBundle resourceBundle=ResourceBundle.getBundle("MessageBundle",Locale.US);
		System.out.println(resourceBundle.getString("welcome"));
		
		ResourceBundle resourceBundle2=ResourceBundle.getBundle("MessageBundle",franceLocale);
		System.out.println(resourceBundle2.getString("welcome"));
	}

}
//RESULT
/*
11 janvier 2021
Welcome to the jungle
Bienvenue dans la jungle
*/
