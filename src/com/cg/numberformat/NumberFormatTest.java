package com.cg.numberformat;

import java.text.NumberFormat;
import java.util.Locale;

class NumberFormatTest{

public static void main(String args[]){

long l = 1203456789;

NumberFormat nf = NumberFormat.getInstance(Locale.US);

NumberFormat nf1 = NumberFormat.getInstance(Locale.UK);

nf.setMaximumFractionDigits(5);

System.out.println(nf.format(l));

System.out.println(nf1.format(l));

}

}

