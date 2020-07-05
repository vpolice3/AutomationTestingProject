package com.skillassure.training.tests;

//import org.apache.commons.math3.analysis.function.Log;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class ArrivalCalendarClick {
	
	// private static Logger Log = LogManager.getLogger(arrivalCalendarClick.class.getName());
WebDriver driver;
	
	@Test
	public void ArrivalCalendarClick_() throws Exception {
		try {
		//Log.info("entering as admin");
			System.setProperty("webdriver.chrome.driver", "E:\\Test\\AutomationTestingProject\\src\\test\\resources\\Chrome\\chromedriver.exe");
			driver=new ChromeDriver();

			driver.get("http://43.254.161.195:8085/happytripcrclean1");
			driver.findElement(By.partialLinkText("in as")).click();
			driver.findElement(By.id("username")).sendKeys("admin@mindtree.com");
			driver.findElement(By.id("password")).sendKeys("admin");
			driver.findElement(By.id("signInButton")).click();
			driver.findElement(By.partialLinkText("Schedule Flight")).click();
		//Log.info("Checking for clicking on arrival calendar");
		WebElement calendar = driver.findElement(By.xpath("//*[@id=\"AddSchedule\"]/dl/dd[8]/img"));
		calendar.click();
		
		String expected = "1";
		WebElement element= driver.findElement(By.className(("ui-state-default")));
		String actual= element.getText();
		Assert.assertEquals(actual, expected);
		driver.navigate().refresh();
		Thread.sleep(2000);
		//driver.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
}
}
