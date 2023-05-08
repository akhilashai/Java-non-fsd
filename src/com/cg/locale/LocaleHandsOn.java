package com.cg.locale;

import java.util.Locale;

public class LocaleHandsOn {

	public static void main(String[] args) {
		
		Locale l =Locale.getDefault();
		System.out.println(l.getCountry()+" "+l.getLanguage());
		System.out.println(l.getDisplayCountry()+" "+l.getDisplayLanguage());
		Locale.setDefault(Locale.CANADA);
		System.out.println(Locale.getDefault().getDisplayCountry());
		String[] isoCountries = Locale.getISOCountries();
		for(String s : isoCountries)
		{
			System.out.println(s);
		}
	}

}
