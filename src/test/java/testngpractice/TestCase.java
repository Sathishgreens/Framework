package testngpractice;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase {
	@BeforeClass
	private void tc1() {
		System.out.println("tc1");
	}
	@BeforeMethod
	private void tc2() {
		System.out.println("tc2");
		
		
	}
	
	@Test(dataProvider="data",dataProviderClass=org.ss.Sample.class)
	private void tc3( int a,int b) {
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
//		SoftAssert softAssert = new SoftAssert();
//		softAssert.assertTrue(false,"dsA");
//		System.out.println("tc3");
	}
	@AfterMethod
	private void tc4() {
		System.out.println("tc4");

	}
	@AfterClass
	private void tc5() {
		System.out.println("tc5");

	}
	
	
	

}
