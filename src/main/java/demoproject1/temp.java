package demoproject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class temp {

	public static void main(String[] args) {
	
			// TODO Auto-generated method stub
			System.out.println(System.getProperty("user.dir"));
			String path = System.getProperty("user.dir");
			String driverpath = path + "\\Resourse\\chromedriver.exe";
			System.out.println(driverpath);
			System.setProperty("webdriver.chrome.driver", driverpath); 
			 WebDriver driver= new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
		// TODO Auto-generated method stub

	}

}
