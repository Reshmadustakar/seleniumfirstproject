package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class signinpage {
WebDriver driver;
	public signinpage(WebDriver driver1) {
		// TODO Auto-generated constructor stub
		this.driver=driver1;
	}
	
	@FindBy(how=How.XPATH,using="//button[@id=\"SubmitLogin\"]")  
	 static WebElement signinbutton;
	@FindBy(how=How.XPATH,using="//input[@id=\"email\"]")
	static WebElement email;
	@FindBy(how=How.XPATH,using="//input[@id=\"passwd\"]")
	static WebElement passwd;
	@FindBy(how=How.XPATH,using="//input[@id=\"email_create\"]")
	static WebElement createemail;
	@FindBy(how=How.XPATH,using="//button[@id=\"SubmitCreate\"]")
	static WebElement createaccountbtn;
	
	public static void clickonsignin()
	{
		signinbutton.click();
	}
	
	public static void enter_email(String email_signin)
	{
		email.sendKeys(email_signin);
	}
	
	public static void enter_password(String enetr_password)
	{
		passwd.sendKeys(enetr_password);
	}
	
	public static void enter_create_email( String enter_email)
	{
		createemail.sendKeys(enter_email);
	}
	
	public static void click_create_button()
	{
		createaccountbtn.click();
	}
	
}
 