package com.collection;

import java.util.ArrayList;

public class StringPrint {

	public static void main(String[] args) {
		
	
		ArrayList<String>  str=new ArrayList<String>();
		
		     str.add("Amrita");
		     str.add("Arun");
		     str.add("Rohit");
		     str.add("Mohit");
		     str.add("s");
		     str.add("Abhinash");
		     System.out.println(str);
		     
		     // print name which start with A
		     System.out.println("========");
		     for(String s:str)
		     {
		    	 if(s.startsWith("A") )
		    	 {
		    		 System.out.println(s);
		    	 }
		     }
		     System.out.println("========");
		     for(String s:str)
		     {
		    	 if(s.endsWith("t") )
		    	 {
		    		 System.out.println(s);
		    	 }
		     }
		     
		     
		     
		     
		      
		     
		
		
		
	}

}
