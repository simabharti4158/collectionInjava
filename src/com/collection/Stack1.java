package com.collection;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
	
		
		Stack s=new Stack();
		s.add(10);
		s.push(80);
		s.add(20);
		s.add(3);
		s.add(6);
		s.add(30);
		s.add(80);
		s.push(100);
		System.out.println(s);
		
		
		String str="java";
		Stack<Character> s1=new Stack<Character>();  // create empty string to reverse the string in array in form of character
		
		for(int i=0;i<str.length();i++)
		{
			s1.push(str.charAt(i));
		}
		System.out.println(s1);
		for(Object o:s1)
		{
			System.out.println(o);
		}
		

	}

}
