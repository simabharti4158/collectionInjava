package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedLIst1
{

	public static void main(String[] args)
	{
		ArrayList li=new ArrayList();
		   li.add("Mango");
		   li.add("Apple");
		   li.add(10);
		   li.add("Mango");
		   li.add(6);
		   li.add(90);
		   li.add(4);
		   li.add(50);
		   li.add('V');
		   li.add('k');
		  
		   System.out.println(li);
		   
//		   1st question
		   
		   System.out.println(" ======remove 1st ocrrenece of mango =====");
		   LinkedList s=new LinkedList(li);
		    s.removeFirstOccurrence("Mango");
		    System.out.println(s);
		    
//		    2nd Question
		    
		    System.out.println("print only character======");
		      for(Object o:s)
		      {
		    	  if(o instanceof Character)
		    	  {
		    		  System.out.println(o);
		    	  }
		      }
		      
		      
		      
		    // 3rd Question
		    LinkedList<Integer> s1=new LinkedList<Integer>();
		    for(Object o:s)
		    {
		      if(o instanceof Integer)
		      {
		    	  Integer i2=(Integer)o;
		    	   s1.add(i2);
		      }
		    }
		    
		    System.out.println(s1);
		    
		    
//		      arrenge in asseneding order
		    
		    for(int i=0;i<s1.size();i++)
		    {
		    	for(int j=i+1;j<s1.size();j++)
		    	{
		    		if(s1.get(i)>s1.get(j))
		    		{
		    			Integer temp = s1.get(i);
		    			s1.set(i,s1.get(j));
		    			s1.set(j, temp);
		    		}
		    	}
		    }
		   System.out.println(s1); 

	}

}
