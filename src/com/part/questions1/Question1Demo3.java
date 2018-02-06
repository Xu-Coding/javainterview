package com.part.questions1;

import org.junit.Test;

/**
 * loop structure
 * the paramters of the cycle structure can only be boolean
 * @author Administrator
 *
 */
public class Question1Demo3 {

	@Test
	public  void loop1(){
		int  j=0;
		 loop:do{
		     System.out.println( "j  is "+j++);
		     if (j == 3) {
		    	 continue  loop;
		     }
		  }while  (j<10);
	}
	
	@Test
	public static void loop2(){
		for(int i=1, j=i+10 ; i<5; i++ , j=i*2)
			System.out.println("i="+i+" j="+j);
		System.out.println("---");
		for(int i=1, j=i+10; i<5; i++){
			j=i*2;
			System.out.println("i="+i+" j="+j);
		}
	}
	
}
