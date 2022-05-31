package testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demosuit2 {

	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("before suit demo2");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("before test  demo2");
	}
	
	
	
	
	@BeforeClass
	public void beforeclass()
	{
		
		System.out.println("Before Class");
	}
	@BeforeMethod
	
	public void beforemethod() 
	{
		System.out.println("Before Method");
		
	}
	
	@Test 
	
	public void testA()
	{
		System.out.println("Testrest");
	}
	
	
  @Test (priority = 1)
	
	public void testV()
	{
		System.out.println("Testmeta");
		
	}


    @Test (priority = 3) 

  public void testM()
{
  System.out.println("Test3444");
  
  
}
	@Test
	public void testq()
	{
	System.out.println("testhard");
	
	
	}
	
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After Method");
	}

	@AfterClass
	public void afterclass()
	{
		System.out.println("After Class");
	}
	

	@AfterTest
	public void aftertest()
	{
		System.out.println("after suit demo2");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("before test  demo2");
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}