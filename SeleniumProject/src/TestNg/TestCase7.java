package TestNg;
import org.testng.annotations.Test;
//disabled the test case
public class TestCase7
{
	@Test(enabled = false)
	public void a1()
	{
		System.out.println("hiii");
	}
	@Test(invocationCount =0)
	public void b1()
	{
		System.out.println("hello");
	}
	@Test()
	public void c1()
	{
		System.out.println("heyy");
	}
	@Test(priority=5)
	public void d1()
	{
		System.out.println("byeee");
	}
}