package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs= new HashSet();
		hs.add("mango");
		hs.add("banana");
		hs.add(10);
		hs.add(30);
		hs.add(null);
		hs.add(null);
		hs.add("java");
		hs.add("mango");
		System.out.println(hs);

		 //
		HashSet hs1= new HashSet();
		hs1.add("Simaaaaaa");
		hs1.add("5000");
	     hs.addAll(hs1);
	     System.out.println(hs);
	     
	     // remove
	     
	     System.out.println("remove the elements=====================");
	     
	     hs.remove(null);
	     hs.remove("java");
	     System.out.println(hs);
	     hs.removeAll(hs1);
	     System.out.println(hs);
	     
	     
	     /// contains or not
	     
	     System.out.println(hs.contains("mango"));
	     System.out.println(hs.contains("java"));
	     
	     
	     //
	     
	     System.out.println(hs.size());
	     System.out.println(hs.isEmpty());
	     System.out.println("===========================");
	     Object[] o1=hs.toArray();
	     // use the loop here bez in hash set index is not allowed but with the hepl of toArray method we can convert the element fron hash to array
	     for(int i=0;i<o1.length;i++)
	     {
	    	 System.out.println(o1[i]);
	    	 
	     }
	     
	     
	    /////// itertor method
	     
	     
	     System.out.println("===============================================");
	      Iterator i11=hs.iterator(); 
	      while(i11.hasNext())
	      {
	    	  System.out.println(i11.next());
	      }
		 
		
	}

}
