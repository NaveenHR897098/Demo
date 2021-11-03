package TestNg;
import org.testng.annotations.Test;
//we can give priority for test case
//default priority is zero
//we can give negative priority
//lowest priority will be first if priority is not given or priority are same execution will start from alphabet order 
public class TestCase6 {
@Test(priority=3)
	public void a1()
	{
		System.out.println("hiii");
	}
	@Test(priority=1)
	public void b1()
	{
		System.out.println("hello");
	}
	@Test(priority=-1)
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
