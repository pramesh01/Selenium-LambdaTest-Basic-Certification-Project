package testcases;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseMainTest;

public class TestScenarioThree extends BaseMainTest {
	
	public TestScenarioThree() {
		 super();	
		 }
	
	@BeforeMethod
	public void setup() {
	  driver=initializeBrowserAndOpenApplication(prop.getProperty("Edge_Browser")); 
	  // driver=initializeBrowserAndOpenApplication("firefox");
	}
	
	@AfterMethod
	public void teardown() {
		 if (driver != null) {
		driver.quit();
		 }
	}
   @Test
   public void scenarioThree_InputFormSubmit() {
	driver.findElement(By.xpath("//a[normalize-space()='Input Form Submit']")).click();
	driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
	boolean b1=driver.findElement(By.xpath("//*[@class='loginform mt-20 p-20']/p")).isDisplayed();
	Assert.assertFalse(b1);
	driver.findElement(By.id("name")).sendKeys("pramesh kumar");
	driver.findElement(By.id("inputEmail4")).sendKeys(mailidwithtimestamp());
	driver.findElement(By.id("inputPassword4")).sendKeys("demotest");
	driver.findElement(By.id("company")).sendKeys("TCS");
	driver.findElement(By.id("websitename")).sendKeys("https://www.lambdatest.com");
	WebElement e=driver.findElement(By.name("country"));
	Select s=new Select(e);
	s.selectByVisibleText("United States");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		e1.printStackTrace();
	}
	driver.findElement(By.id("inputCity")).sendKeys("newyork");
	driver.findElement(By.id("inputAddress1")).sendKeys("mig 21");
	driver.findElement(By.id("inputAddress2")).sendKeys("sec B");
	driver.findElement(By.id("inputState")).sendKeys("Alaska");
	driver.findElement(By.id("inputZip")).sendKeys("657109");
	driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e1) {
	}
	boolean b=driver.findElement(By.xpath("//*[@class='loginform mt-20 p-20']/p")).isDisplayed();
	//String expectedMessageonsuccessfulformsubmit="Thanks for contacting us, we will get back to you shortly.";
	Assert.assertTrue(b);
	//Assert.assertEquals(expectedsuccessfulsubmitmessage, expectedMessageonsuccessfulformsubmit);
	System.out.println("SuccesFul form submitted.and output validated.");
	}

   public  String mailidwithtimestamp() {
		Date d=new Date();
		String timestampdate=d.toString().replace(" ","_").replace(":","_");
		return "pramesh"+timestampdate+"@gmail.com";
	}
      }
