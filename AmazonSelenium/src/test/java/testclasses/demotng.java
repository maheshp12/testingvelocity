package testclasses;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class demotng {
	SoftAssert soft;
	@BeforeClass
		public void beforeclass()
		{
			
			System.out.println("Before Class");
		}
		@BeforeMethod
		
		public void beforemethod() 
		{
			System.out.println("Before Method");
			 soft = new SoftAssert();
		}
		
		@Test (priority = 4)
		
		public void testA()
		{
			System.out.println("Test1");
		}
		
		
      @Test (priority = 1)
		
		public void testV()
		{
			System.out.println("Test2");
			soft.assertEquals("take", "short");
			soft.assertEquals("bat", "mat");
			soft.assertAll();
		}


        @Test (priority = 3) 

      public void testM()
   {
	  System.out.println("Test3");
	  
	  Assert.assertEquals("mah", "fra");
	  Assert.assertEquals("see", "see");
   }
		@Test
		public void testq()
		{
		System.out.println("testsoft");
		
		soft.assertEquals("tall", "short");
		soft.assertEquals("bat", "bat");
		soft.assertAll();
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
		
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
