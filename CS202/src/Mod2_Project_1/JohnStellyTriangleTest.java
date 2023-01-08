package Mod2_Project_1;

/**
*
* Student name:  xxxxx
* Completion date: xxxx
*
* TriangleTest.txt: the template file of TriangleTest.java
* Student tasks: 
* - Write 20 JUnit test cases for Triangle class 
* - Then run this file on the command line with the jar files provided
*
*/

import static org.junit.Assert.*;
import org.junit.Test;

public class JohnStellyTriangleTest {

	@Test
	public void test1(){
		Triangle triangle = new Triangle("12","12","12");
		assertEquals("This is an equilateral triangle. ",triangle.triangleType());	
	}//end test
	
	@Test
	public void test2(){
		Triangle triangle = new Triangle("3","3","5");
		assertEquals("This is an isosceles triangle. ",triangle.triangleType());
	}//end test
	
	@Test
	public void test3(){
		Triangle triangle = new Triangle("4","5","6");
		assertEquals("This is a scalene triangle. ", triangle.triangleType());
		// expected value: "This is a scalene triangle. "  
		// value returned from the method: triangle.triangleType() 
	}//end test
	
	@Test
	public void test4(){
		Triangle triangle = new Triangle("7000","9000","7000");
		assertEquals("This is an isosceles triangle. ", triangle.triangleType());
	}//end test

	@Test
	public void test5(){
		Triangle triangle = new Triangle();
		assertEquals("Not a valid triangle! ", triangle.triangleType());
	}//end test
	
	@Test
	public void test6(){
		Triangle triangle = new Triangle("c","c","c");
		assertEquals("Not a valid triangle! ", triangle.triangleType());
	}//end test
	
	@Test
	public void test7(){
		Triangle triangle = new Triangle("2","5","2");
		assertEquals("Not a valid triangle! ", triangle.triangleType());
	}//end test
	
	@Test
	public void test8(){
		Triangle triangle = new Triangle("-6","5","6");
		assertEquals("Not a valid triangle! ", triangle.triangleType());
	}//end test
	
	@Test
	public void test9(){
		Triangle triangle = new Triangle("-6","5","4");
		assertEquals("This is a scalene triangle. ", triangle.triangleType());
	}//end test
	
	@Test
	public void test10(){
		Triangle triangle = new Triangle("4","5","-6");
		assertEquals("Not a valid triangle! ", triangle.triangleType());
	}//end test	
	
	@Test
	public void test11(){
		Triangle triangle = new Triangle("4","-6","5");
		assertEquals("Not a valid triangle! ", triangle.triangleType());
	}//end test
	
	@Test
	public void test12(){
		Triangle triangle = new Triangle("","10","10");
		assertEquals("Not a valid triangle! ", triangle.triangleType());
	}//end test
	
	@Test
	public void test13(){
		Triangle triangle = new Triangle("10","","10");
		assertEquals("Not a valid triangle! ", triangle.triangleType());
	}//end test
	
	@Test
	public void test14(){
		Triangle triangle = new Triangle("10","10","");
		assertEquals("Not a valid triangle! ", triangle.triangleType());
	}//end test
	
	@Test
	public void test15(){
		Triangle triangle = new Triangle("11","12","11.5");
		assertEquals("Not a valid triangle! ", triangle.triangleType());
	}//end test
	
	@Test
	public void test16(){
		Triangle triangle = new Triangle("11.5","12","11");
		assertEquals("Not a valid triangle! ", triangle.triangleType());
	}//end test	
	
	@Test
	public void test17(){
		Triangle triangle = new Triangle("11","12.1","11");
		assertEquals("Not a valid triangle! ", triangle.triangleType());
	}//end test

	@Test
	public void test18(){
		Triangle triangle = new Triangle("11","12.1","11");
		assertEquals("Not a valid triangle! ", triangle.triangleType());
	}//end test	

	@Test
	public void test19(){
		Triangle triangle = new Triangle("7","3","3");
		assertEquals("Not a valid triangle! ", triangle.triangleType());
	}//end test
	
	@Test
	public void test20(){
		Triangle triangle = new Triangle("3","3","7");
		assertEquals("Not a valid triangle! ", triangle.triangleType());
	}//end test

}
