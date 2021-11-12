package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.signinpage;
import utility.baseclass;

public class TC_01_createaccount extends baseclass {
	@Test
	@Parameters({"browser","browserstack"})
 public static void createaccount(String browser, String browserstack)
	 
 {
	//	driver.get("");
		Homepage homepage = PageFactory.initElements(driver, Homepage.class);
		homepage.clickloginbutton();
		
		signinpage Signinpage = PageFactory.initElements(driver, signinpage.class );
		Signinpage.enter_email("dustakar.reshma@gmail.com");
		Signinpage.enter_password("12345");
		
 }
}
