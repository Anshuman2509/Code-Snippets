package com.merc;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class LocaleExample 
{
    public static void main( String[] args ){
       long a=123456789L;
       Locale locale=Locale.FRANCE;
       NumberFormat format=NumberFormat.getCurrencyInstance(locale);
       System.out.println(format.format(a));
       
       Locale locale2=Locale.JAPAN;
       NumberFormat format2=NumberFormat.getCurrencyInstance(locale2);
       System.out.println(format2.format(a));       
       
       Locale locale3=new Locale("hi", "IN");
       NumberFormat format3=NumberFormat.getCurrencyInstance(locale3);
       System.out.println(format3.format(a));
       
       Date date=new Date();
       DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.SHORT, locale3);
       System.out.println(dateFormat.format(date));
       
       DateFormat dateFormat2=DateFormat.getDateInstance(DateFormat.LONG, locale3);
       System.out.println(dateFormat2.format(date));
       
       DateFormat dateFormat3=DateFormat.getDateInstance(DateFormat.FULL, locale3);
       System.out.println(dateFormat3.format(date));
       
       Locale locale4=Locale.GERMAN;
       DateFormat dateFormat4=DateFormat.getDateInstance(DateFormat.LONG, locale4);
       System.out.println(dateFormat4.format(date));
       
       Locale locale5=new Locale("fr","CA");
       DateFormat dateFormat5=DateFormat.getDateInstance(DateFormat.LONG, locale5);
       System.out.println(dateFormat5.format(date));
       
       Locale locale6=new Locale("de","DE");
       DateFormat dateFormat6=DateFormat.getDateInstance(DateFormat.LONG, locale6);
       System.out.println(dateFormat6.format(date));
       
    }
}
//RESULT
/*
123 456 789,00 €
￥123,456,789
₹123,456,789.00
11/1/21
11 जनवरी 2021
सोमवार, 11 जनवरी 2021
11. Januar 2021
11 janvier 2021
11. Januar 2021
*/