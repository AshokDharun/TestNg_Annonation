package TestNG_Parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Subtraction {
	@Test
	@Parameters({"a","b"})
	public void add(int e, int f)
	{
		int sum=e-f;
		System.out.println("subtraction two value is: " + sum);
		
	}
}
