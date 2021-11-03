package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;
//add the commants to report and to print it in console
public class TestCase8 
{
	@Test
	public void login()
	{
		System.out.println("heyy!!!!!!!!!!!");
		Reporter.log("its is a test report",true);
		Reporter.log("test case id 12345678",false);	
	}
}
