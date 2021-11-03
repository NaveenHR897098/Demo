package TestNg;
import org.testng.annotations.Test;
//create depends between test cases
//fail of one test case will lead to skipping of depentent test case
public class TestCase9 
{
	@Test
	public void login()
	{
		System.out.println("hiii");
		throw new ArithmeticException();
	}
	@Test(dependsOnMethods ="login")
	public void cart()
	{
		System.out.println("hello");
	}
	@Test(dependsOnMethods ="login")
	public void logout()
	{
		System.out.println("byeee");
	}
}
