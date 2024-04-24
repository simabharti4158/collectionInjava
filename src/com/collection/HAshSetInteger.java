package com.collection;

import java.text.Collator;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class HAshSetInteger {

	public static void main(String[] args) {
		
	   HashSet<Integer> hs= new HashSet<Integer>();
	   hs.add(40);
	   hs.add(45);
	   hs.add(43);
	   hs.add(23);
	   hs.add(40);
	   hs.add(20);
	   hs.add(20);
	   hs.add(10);
	   System.out.println(hs);
	   
	  LinkedList list=new LinkedList(hs);
	  Collections.sort(list);
	  
	  System.out.println(list);
	
	  
	}
	

}
