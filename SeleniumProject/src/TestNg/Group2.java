package TestNg;

import org.testng.annotations.Test;

public class Group2 {
	public class Group1 {
		@Test(groups = "regrassiontestcase")
		public void smoke()
		{
			System.out.println("this is regrassion testcases");
		}
		@Test(groups = "smoketestcase")
		public void smoke1()
		{
			System.out.println("this is smoke testcases");
		}
}
}