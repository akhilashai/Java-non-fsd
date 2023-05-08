package com.cg.problemsolving;

public class Exchange {
	

	public String frontBack(String str)
	{
		int index = str.length()-1;
		char start = str.charAt(0);
		char end = str.charAt(index);
		String newString = end + str.substring(1,str.length())+start;
		return newString;
	}
	
	public String front3(String str)
	{
		if(str.length()>3)
		{
		String newString = str.substring(0,3);
		
		
		return newString+newString+newString;
		}
		else
		{
			return str+str+str;
		}
	}
	public boolean in1020(int a, int b) {
		  return ((a>=10&&b<=20)||((a<=20)&&(a>=10)))?true : false;
		}
	
	public boolean hasTeen(int a, int b, int c) {
		  return ((a>=13&&a<=19)||(b>=13&&b<=19)||(c>=13&&c<=19))? true :false;
		}
	public String front22(String str) {
		  
		  String newString;
		  if(str.length()>=2)
		  {
			  String two = str.substring(0,2);
		    newString = two+str.substring(0,str.length())+two;
		   
		  }
		  else
		  {
		    newString= str+str+str;
		  }
		  return newString;
		  
		}
	
	public String startOz(String str) {
		  String newString="";
		  if(str.charAt(0)=='o'&&str.length()>1)
		  {
		    newString = newString + str.charAt(0);
		  }
		 
		  if(str.charAt(1)=='z'&&str.length()>1)
		  {
		    newString = newString + str.charAt(1);
		  }
		  return newString;
		}
	
	public int max1020(int a, int b) {
		 if ((a>=10 && a<=20)||(b>=10 && b<=20))
		 {
		   if((!(a>=10) && !(a<=20)))
		   {
		     return b;
		   }
		    if(!(b>=10) && !(b>=20))
		   {
		     return a;
		   }
		    return (a>b) ?a :b;
		 }
		 else
		 {
		   return 0;
		 }
		}


	public static void main(String[] args) {
		
		Exchange ex = new Exchange();
		String frontBack = ex.frontBack("a");
		System.out.println(frontBack);
		System.out.println(ex.front22("a"));
		System.out.println(ex.startOz("akh"));
		System.out.println(ex.max1020(10, 21));
	}

}
