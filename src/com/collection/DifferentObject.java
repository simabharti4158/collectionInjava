package com.collection;

import java.util.ArrayList;

public class DifferentObject {

	public static void main(String[] args) 
	{
	    ArrayList aa=new ArrayList();
	    aa.add("Sima");
	    aa.add(10);
	    aa.add('v');
	    aa.add(20);
	    aa.add("Supriya");
	    aa.add("Bharti");
	    aa.add('k');
	    aa.add(12);
	    aa.add(6);
	    aa.add(11);
	    aa.add(8);
	    aa.add("Ragni");
	    aa.add("Shobha");
	    aa.add("s");
	    aa.add("Deepika");
	    
	    System.out.println("This is interger===================");
	  
	    for(Object o:aa)
	    {
	    	if(o instanceof Integer )	
	    	{
	    		Integer i=(Integer)o;
	    	  if(i>=10 && i<=20)
	    	  {
	    		System.out.println(o);  
	    	  }
//	    	
	    	}
        }
	    System.out.println("This is Character====================");
	    for(Object o:aa)
	    {
	    	if(o instanceof Character)
	    	{
	    		
	    		System.out.println(o);
	    	}
        }
	   
	    System.out.println("This is String======================");
	   
	    for(Object o:aa)
	    {
	    	if(o instanceof String)
	    	{
	    	  String s=(String)o;
	    	  
	    		if(s.startsWith("S") || s.endsWith("a"))
	    		{
	    			System.out.println(s);
	    		}
	    	}
        }
	    
	    
	    

	}

}
