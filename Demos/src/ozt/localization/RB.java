package ozt.localization;

import java.io.File;
import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;


class MyRB extends ListResourceBundle {
	
	public MyRB() {}
	
	@Override
	protected Object[][] getContents() {		
		Object[][] data = {
				{"sausage", "sausage"}	
		};
		
		return data;		
	}
}

class MyRB_fr_FR extends ListResourceBundle{
	
	public MyRB_fr_FR() {}
	
	@Override
	protected Object[][] getContents() {
		// scripter....
		
		Object[][] data = {
				{"sausage", "saucisse"}	
		};
		
		return data;		
	}
}



public class RB {	
	
	void f(){
		Locale loc = new Locale("en", "IN");
		File f = new File("/quelque/part");
		
	}
	
	public static void main(String[] args) {
		ResourceBundle myRB = ResourceBundle.getBundle("ozt.localization.MyRB");
		System.out.println(myRB.getString("sausage"));
		
		ResourceBundle myRB2 = ResourceBundle.getBundle("ozt.localization.MyRB", Locale.of("fr","FR"));
		System.out.println(myRB2.getString("sausage"));		
	}
	
	public static void main4(String[] args) {
		
		
		Locale us = Locale.US;
		System.out.println(us);
		
		us.getCountry(); // US
		us.getLanguage(); // en
		
		System.out.println(us.getDisplayCountry()); // ?
		System.out.println(us.getDisplayLanguage()); // ?
		
		System.out.println(us.getDisplayCountry(Locale.ITALIAN));
		System.out.println(us.getDisplayLanguage(Locale.ITALIAN));
		
	}
	
	public static void main3(String[] args) {
		Locale chinois = Locale.CHINESE;
		ResourceBundle rb = ResourceBundle.getBundle("ozt.localization.MyStrings", chinois);
		System.out.println(rb.getString("forecast")); // ????
		
		//   fr_FR
		//   1. MyStrings.fr_FR.properties
		//   2. MyStrings.fr.properties
		//   3. MyStrings.propeties
		
		//   MyStrings.fr_BE.propeties < ignoré
				
		rb = ResourceBundle.getBundle("ozt.localization.MyStrings", Locale.of("fr","FR"));
		System.out.println(rb.keySet());
		System.out.println(rb.getString("pizza"));
		System.out.println(rb.getString("forecast"));
	}
	
	public static void main2(String[] args) {
		
		// lang_COUNTRY
		Locale l = Locale.getDefault();
		System.out.println(l);
				
		System.out.println(Locale.FRANCE); // fr_FR
		System.out.println(Locale.CANADA); // 
		System.out.println(Locale.UK); 	   // 
		
		Locale wtf = new Locale("klingo", "Espace");
		System.out.println(wtf);
		Locale francaisEnUK = Locale.of("fr", "GB");
		
	}
}
