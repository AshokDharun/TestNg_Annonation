package TestNG_Listner;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners
public class testlistner
{
	@Test
public void sum()
{
	int a=10;
	int b=5;
	int c=a+b;
	System.out.println("The addition of two values is:" + c);
}
	@Test
public void testfail()
{
	System.out.println("Is failled");
}
}
