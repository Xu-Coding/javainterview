package com.part.questions1;

import org.junit.Test;

public class Question1Demo4 {
	/**
	 * test create String object
	 */
	@Test
	public  void stringTest1(){
		String  s1="abc"+"def";
		String  s2=new  String(s1);
		if(s1==s2)
	      System.out.println("= = succeeded");
		if (s1.equals(s2))
	      System.out.println(".equals()  succeeded");
	}
	
	
}
