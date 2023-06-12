package TestNGAnnotation;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class testng
{
	@AfterClass
	public void Afterclass()
	{
		System.out.println("This method is executed After class");
	}
@Test
public void display()
{
	System.out.println("Display");
}
@BeforeSuite
public void besite()
{
	System.out.println("This is for before site method");
}
@BeforeTest
public void betest()
{
	System.out.println("Before test method executed");
}
@AfterTest
public void aftest()
{
	System.out.println("this After test annotation");
}
}
