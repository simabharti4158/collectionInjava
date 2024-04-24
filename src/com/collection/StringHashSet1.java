package com.collection;

import java.util.HashSet;

public class StringHashSet1 {

	public static void main(String[] args) {
		
		String s="big black black bug is setting on big black nose of big";
		System.out.println(s);
		String[] str=s.split(" ");
	
		  HashSet<String> hs= new HashSet<String>();
		  for(int i=0;i<str.length;i++)
		  {
			hs.add(str[i]);  
		  }
		  
		  
		  System.out.println(hs);

	}

}
