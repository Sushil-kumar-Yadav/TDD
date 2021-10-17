package com.demo.TDD;




import java.util.Scanner;

import org.junit.*;
/**
 * Unit test for simple App.
 */

public class AppTest {
	
	@Test
	public void  getSum() {
    
	
	Scanner sc = new Scanner(System.in);
	
	int x = sc.nextInt();
	int y = sc.nextInt();
//	int expected = 9;
	
	App cal = new App();
	int sum = cal.getSum(x,y);
	
	Assert.assertEquals(9,11,sum);
	
    
		
	}
	
	 	
}
     
