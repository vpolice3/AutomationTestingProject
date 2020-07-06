package com.skillassure.training.tests;

//import org.apache.commons.math3.analysis.function.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class ArrivalCalendarClick {
	
	private static Logger Log = LogManager.getLogger(ArrivalCalendarClick.class.getName());
WebDriver driver;
	
	@Test
	public void ArrivalCalendarClick_() throws Exception {
		try {
		Log.info("entering as application");
			System.setProperty("webdriver.chrome.driver", "E:\\Test\\AutomationTestingProject\\src\\test\\resources\\Chrome\\chromedriver.exe");
			Log.info("Opening chrome driver");
			driver=new ChromeDriver();
			Log.info("Opening application");
			driver.get("http://43.254.161.195:8085/happytripcrclean1");
			Log.info("Opening loginasadmin");
			driver.findElement(By.partialLinkText("in as")).click();
			Log.info("Clciking on username field");
			driver.findElement(By.id("username")).sendKeys("admin@mindtree.com");
			Log.info("Clicking as password");
			driver.findElement(By.id("password")).sendKeys("admin");
			Log.info("Clicking on sigin");
			driver.findElement(By.id("signInButton")).click();
			Log.info("Clciking on schedule flight");
			driver.findElement(By.partialLinkText("Schedule Flight")).click();
			
		Log.info("Checking for clicking on arrival calendar");
		WebElement calendar = driver.findElement(By.xpath("//*[@id=\"AddSchedule\"]/dl/dd[8]/img"));
		Log.info("Opening chrome driver");
		calendar.click();
		Log.info("Opening chrome driver");
		String expected = "1";
		WebElement element= driver.findElement(By.className(("ui-state-default")));
		Log.info("Opening chrome driver");
		String actual= element.getText();
		Log.info("Opening chrome driver");
		Assert.assertEquals(actual, expected);
		Log.info("Opening chrome driver");
		driver.navigate().refresh();
		Log.info("Opening chrome driver");
		Thread.sleep(2000);
		//driver.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
}
}
