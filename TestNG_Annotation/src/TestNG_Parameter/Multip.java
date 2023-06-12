package TestNG_Parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multip {
	@Test
	@Parameters({"a","b"})
	public void Multi(int e, int f)
	{
		int sum=e*f;
		System.out.println("Multiplication two value is: " + sum);
		
	}
}
