package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseMainTest;

public class TestScenarioTwo extends BaseMainTest{
	
	public TestScenarioTwo() {
		 super();	
	  }
	
	@BeforeMethod
	public void setup() {
	   driver=initializeBrowserAndOpenApplication(prop.getProperty("Chrome_Browser")); 
	}
	
	@AfterMethod
	public void teardown() {
		 if (driver != null) {
				driver.quit();
				 }
	}
	
	@Test
	public void scenarioTwo_Sliderto_95() throws InterruptedException {
		System.out.println("scenario two");
		driver.findElement(By.xpath("//a[normalize-space()='Drag & Drop Sliders']")).click();
		WebElement sourcePoint=driver.findElement(By.xpath("//input[@value='15']"));
		Actions actions=new Actions(driver);
		actions.dragAndDropBy(sourcePoint, 216, 0).build().perform();
		Thread.sleep(5000);
		String slidertargetvalue=driver.findElement(By.xpath("//*[@id='rangeSuccess']")).getText();
		//System.out.println("slider value is "+slidertargetvalue);
		if(slidertargetvalue.equals("95")) {
			System.out.println("target value of slider is 95 and test case passed.");
		}else {
			System.out.println("slider value is not 95 and test case filed");
		}
		
		
		
		
		//input[@value="15"]
	}
	
	

}
