package TestNGAnnotation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test1 {
	
	@Test
	public void dis()
	{
		System.out.println("@Test Display Method");
	}
	@AfterSuite
public void aftersite()
{
	System.out.println("This is sfter site methos");
}
@BeforeClass
public void beforeclass()
{
	System.out.println("This method is executed before class");
}
}
