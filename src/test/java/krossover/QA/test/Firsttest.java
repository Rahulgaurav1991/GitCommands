package krossover.QA.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Firsttest 
{
@Test
public void sum() {
	int a=10;
	int b=30;
	System.out.println("Sum of ");
	Assert.assertEquals(40, a+b);
	
}
@Test
public void sub() {
	int a=10;
	int b=30;
	Assert.assertEquals(20, b-a);
	System.out.println("Substraction of ");
	
}
}