package utility;

import java.io.FileNotFoundException;
import com.browserstack.local.Local;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class baseclass {
	public static WebDriver driver;
	public static Properties p=null;
	 static String url;
	@BeforeTest
	@Parameters({"browser","browserstack"})
	public static void LaunchBrowser(String browser, String browserstack) throws Exception
	{
		url=p.getProperty("url");
		System.out.println("fetched url="+url);
		if(browserstack.equalsIgnoreCase("true"))
		{
			 String AUTOMATE_USERNAME = "reshmadustakar_kQ1Oe6";
				String AUTOMATE_ACCESS_KEY = "UtFQnQDwEmn86FAPxeyd";
				 String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
				DesiredCapabilities caps = new DesiredCapabilities();
				WebDriverWait wait;
				
				
		

			//	# creates an instance of Local
				Local bsLocal = new Local();

			//	# replace <browserstack-accesskey> with your key. You can also set an environment variable - "BROWSERSTACK_ACCESS_KEY".
				HashMap<String, String> bsLocalArgs = new HashMap<String, String>();
				bsLocalArgs.put("key", AUTOMATE_ACCESS_KEY);

			//	# starts the Local instance with the required arguments
				bsLocal.start(bsLocalArgs);

			//	# check if BrowserStack local instance is running
				System.out.println(bsLocal.isRunning());

		//		#stop the Local instance
			//	bsLocal.stop();

				
				
			//	caps.setCapability("os", "OS X");
			//	caps.setCapability("os_version", "Catalina");
			//	caps.setCapability("browser", "Safari");
			//	caps.setCapability("browser_version", "13.0");
			//	caps.setCapability("resolution", "1280x960");
			//	caps.setCapability("browserstack.local", "false");
			//	caps.setCapability("browserstack.selenium_version", "3.14.0");
			//	caps.setCapability("name", "First Test"); // test name
			//	caps.setCapability("build", "BStack Build Number 1");
				
				
				caps.setCapability("os_version", "11.0");
				caps.setCapability("device", "Samsung Galaxy S21 Ultra");
				caps.setCapability("real_mobile", "true");
				caps.setCapability("browserstack.local", "true");
				

				
			
				
				driver = new RemoteWebDriver(new URL(URL), caps);
		}
		else
		{
			
	if(browser.toLowerCase().equals("chrome"))
	{
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir");
		String driverpath = path + "\\src\\main\\resources\\driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath); 
		driver = new ChromeDriver();
		
		
	}
	else if (browser.toLowerCase().equals("firefox"))
	{
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir");
		String driverpath = path + "\\src\\main\\resources\\driver\\firefox.exe";	
		System.setProperty("webdriver.gecko.driver", driverpath); 
		driver = new FirefoxDriver();
	}
	else if (browser.toLowerCase().equals("opera"))
	{
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir");
		String driverpath = path + "\\src\\main\\resources\\driver\\opera.exe";
		System.setProperty("webdriver.opera.driver", driverpath); 
		driver = new OperaDriver();
	}
	else 
	{
		System.out.println("Specify the driver");
	}
		}
driver.get(url);
	}
	@BeforeSuite
	@Parameters({"env"})
public static void setup(String env) throws IOException
{

	String path =System.getProperty("user.dir")+"/src/main/resources/data/"+env+"/"+env+".properties";
	 FileReader reader=new FileReader(path);  
	   p=new Properties(); 
	// Properties p = new pr
	    p.load(reader); 
	    System.out.println(p.getProperty("name"));
}
}
