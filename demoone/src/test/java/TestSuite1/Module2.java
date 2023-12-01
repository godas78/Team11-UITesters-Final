package TestSuite1;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Module2 {
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am executing bfore Method");
	}
	@Test
	public void test001() {
		System.out.println("I am executing testcase 001");
		Reporter.log("I am executing testcase001");
		//Assert.assertEquals(false, true);
	}
	@Test
	public void test002() {
		System.out.println("I am executing testcase 002");
		Reporter.log("I am executing testcase002");
	}

	@Test(groups = {"smoke","sanity"}) 
	public void test003() {
		System.out.println("I am executing testcase 003");
		Reporter.log("I am executing testcase003");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("Executing after method");
	}
	@DataProvider
	public Object[][] data001(){
		Object[][] data = {{"goda", "Pass001"},{"shrav","pass002"}};
			return data;
	}
	@Test (dataProvider="data001")
	public void login(String username, String password) {
		System.out.println(username +  "and" + password);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
