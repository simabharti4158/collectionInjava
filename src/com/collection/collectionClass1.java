package com.collection;

import java.util.ArrayList;

public class collectionClass1 {

	public static void main(String[] args) {
		
		
		ArrayList list=new ArrayList();
		 list.add("Ram");
		 list.add("10");
		 list.add(52.65d);
		 list.add(10);
		 list.add(null);
		 list.add('v');
		 list.add(874568123);
		 list.add("mango");
		 System.out.println(list);
		 list.add(0,"sima");
		 System.out.println(list);
		 
		ArrayList li = new ArrayList(); 
		li.add("hello");
		li.add(56);
		 list.addAll(li);
		 System.out.println(list);
		 list.addAll(5,li);
		 System.out.println(list);
		 
		 
		 
		 /// remove element
		 
		 
		 list.remove("Ram");
		 list.remove(8);  // index 
		 System.out.println(list);
		 list.removeAll(li); // remove new created collection
		 System.out.println(list); 
		 
//		 list.clear();
//		 System.out.println(list);
		 
		 
		 
		 // To check the presence
		 
		   boolean s=list.contains("mango");
		   System.out.println(s);
		   System.out.println(list.contains(10));
		   System.out.println(list.contains(56));
		   
		   // collection contain or not
		   
		   System.out.println(list.containsAll(li));
		   
		   System.out.println(list.indexOf("mango")); // index 
		   
		   System.out.println(list.indexOf("Ram"));
		   
		   
		   
		   // to modify
		   
		   list.set(0,"bharti");
		   System.out.println(list);
		   
		 

		
		 
		 
		

	}

}
