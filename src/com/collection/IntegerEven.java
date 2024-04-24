package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class IntegerEven {
 
	public static void main(String[] args) {
	
		
		 ArrayList<Integer> a1=new ArrayList<Integer>();
		 
		 a1.add(10);
		 a1.add(51);
		 a1.add(50);
		 a1.add(11);
		 a1.add(20);
		 a1.add(57);
		 System.out.println(a1);
		 
		 /// 1st way
		 
		 for(int i=0;i<a1.size();i++)
		 {
			 if(a1.get(i)%2==0)
			 {
				 System.out.println(a1.get(i));
			 }
		 }
		 
		 
		 System.out.println("==================================");
		 // 2nd  way
		 
		 for(Integer a : a1)
		 {
			 if(a%2==0)
			 {
				 System.out.println(a); 
			 }
		 }
		 
		  System.out.println("==== 3rd== Iterator Method=====");
		  
		  Iterator<Integer> s1=a1.iterator();
		  
		  while(s1.hasNext())
		  {
			  Integer value=s1.next();
			  if(value%2==0)
			  {
				  System.out.println(value);  
			  }
			 
		  }
		  
		  System.out.println("==4th way===");
		  
	       ListIterator<Integer> s3=a1.listIterator();
	       while(s3.hasNext())
	       {
	    	  
	    	   Integer value=s3.next();
				  if(value%2==0)
				  {
					  System.out.println(value);  
				  }
	       }
		 
		 
		 
		 

	}

}
