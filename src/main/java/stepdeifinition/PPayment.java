package stepdeifinition;

import org.openqa.selenium.support.PageFactory;

import pages.Homepage;
import pages.signinpage;

public class PPayment {
	public static void createaccount(String browser, String browserstack)
	 
	 {
		//	driver.get("");
			Homepage homepage = PageFactory.initElements(driver, Homepage.class);
			homepage.clickloginbutton();
			
			signinpage Signinpage = PageFactory.initElements(driver, signinpage.class );
			Signinpage.enter_email("dustakar.reshma@gmail.com");
			Signinpage.enter_password("12345");
			
	 }
public static void verifysignin(String browser)
	
	{
	
	}
public static void Verifyaccount(String browser, String browserstack)

{
	//	driver.get("");
		Homepage homepage = PageFactory.initElements(driver, Homepage.class);
		homepage.clickloginbutton();
		
		signinpage Signinpage = PageFactory.initElements(driver, signinpage.class );
		Signinpage.enter_email("dustakar.reshma@gmail.com");
		Signinpage.enter_password("12345");
		
}
public static void createsignin(String browser)

{

}
}
