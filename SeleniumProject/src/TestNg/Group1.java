package TestNg;

import org.testng.annotations.Test;

public class Group1 {
@Test(groups = "smoketestcase")
public void smoke()
{
	System.out.println("this is smoke testcases");
}
@Test(groups = "regrassiontestcase")
public void smoke1()
{
	System.out.println("this is regrassion testcases");
}
}
