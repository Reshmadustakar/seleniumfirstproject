package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage {
	WebDriver driver;

	public Homepage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}

	@FindBy(how = How.XPATH, using = "//a[@class=\"login\"]")
	static WebElement signin;
	@FindBy(how = How.XPATH, using = "//a[@title=\"Women\"]")
	static WebElement womenbutton;

	public static void clickloginbutton() {
		signin.click();
	}

	public static void clickwomenbtn() {
		womenbutton.click();
	}
}
