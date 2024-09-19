package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.AbstractDriverOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseMainTest {
	
	public static WebDriver driver=null;
	public Properties prop;
	public String username="pramesh.cs";
	public String accesskey="dNhl0zFzTVae7njz830Ev3Ywo394ZHP7ffAsEYZm5CI17vde7U";
	//public  RemoteWebDriver driver = null;
	public  String gridURL="@hub.lambdatest.com/wd/hub";
	public boolean status = false;
	
	public BaseMainTest() {
		  prop=new Properties();	
		  String path=System.getProperty("user.dir")+"//src//main//java//config//Config.properties";
		  try {
			 File propfile=new File(path);
			 FileInputStream fis=new FileInputStream(propfile);
			prop.load(fis);
		} catch (Exception e) {
			System.out.println("file not found inside Catch block propertiesfile reader in BaseMainTest class");
		  e.printStackTrace();
		}
		 }
	
	public WebDriver initializeBrowserAndOpenApplication(String bName) {
		@SuppressWarnings("rawtypes")
		AbstractDriverOptions browserOptions=null;
		//DesiredCapabilities capabilities = new DesiredCapabilities();
		if(bName.equalsIgnoreCase("chrome")) {
			
			browserOptions = new ChromeOptions();
			browserOptions.setPlatformName("Windows 11");
			browserOptions.setBrowserVersion("128");
			HashMap<String, Object> ltOptions = new HashMap<String, Object>();
			ltOptions.put("username", "pramesh.cs");
			ltOptions.put("accessKey", "dNhl0zFzTVae7njz830Ev3Ywo394ZHP7ffAsEYZm5CI17vde7U");
			ltOptions.put("visual", true);
			ltOptions.put("video", true);
			ltOptions.put("network", true);
			ltOptions.put("build", "lambdaTestBuild");
			ltOptions.put("project", "LambdaTest_Selenium101_CertificationPROJECT");
			ltOptions.put("name", "scenarioTwo_Sliderto_95");
			ltOptions.put("selenium_version", "4.0.0");
			ltOptions.put("w3c", true);
			browserOptions.setCapability("LT:Options", ltOptions);
			
		}
		
		else if(bName.equalsIgnoreCase("edge")) {
			
			browserOptions = new EdgeOptions();
			browserOptions.setPlatformName("Windows 11");
			browserOptions.setBrowserVersion("127");
			HashMap<String, Object> ltOptions = new HashMap<String, Object>();
			ltOptions.put("username", "pramesh.cs");
			ltOptions.put("accessKey", "dNhl0zFzTVae7njz830Ev3Ywo394ZHP7ffAsEYZm5CI17vde7U");
			ltOptions.put("visual", true);
			ltOptions.put("video", true);
			ltOptions.put("network", true);
			ltOptions.put("build", "lambdaTestBuild");
			ltOptions.put("project", "LambdaTest_Certification");
			ltOptions.put("name", "scenarioThree_InputFormSubmit");
			ltOptions.put("w3c", true);
			browserOptions.setCapability("LT:Options", ltOptions);
		}
		else if(bName.equalsIgnoreCase("firefox")){
			browserOptions=new FirefoxOptions();
			browserOptions.setPlatformName("Windows 10");
			//browserOptions.setBrowserVersion("130");
			HashMap<String, Object> ltOptions = new HashMap<String, Object>();
			ltOptions.put("username", "pramesh.cs");
			ltOptions.put("accessKey", "dNhl0zFzTVae7njz830Ev3Ywo394ZHP7ffAsEYZm5CI17vde7U");
			ltOptions.put("visual", true);
			ltOptions.put("video", true);
			ltOptions.put("network", true);
			ltOptions.put("build", "lambdaTestBuild");
			ltOptions.put("project", "LambdaTest_Certification_firefox");
			ltOptions.put("name", "scenarioOne_SimpleFormDemo");
			ltOptions.put("selenium_version", "4.0.0");
			ltOptions.put("w3c", true);
			browserOptions.setCapability("LT:Options", ltOptions);
			
		}
		try {
			driver=new RemoteWebDriver(new URL("https://"+username+":"+accesskey+gridURL),browserOptions);
		} catch (Exception e) {
			System.out.println("Grid Url is Invalid ");
			e.getMessage();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.get(prop.getProperty("url"));
		return driver;
	}	
	 }