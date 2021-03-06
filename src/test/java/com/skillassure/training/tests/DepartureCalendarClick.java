package com.skillassure.training.tests;
import org.apache.commons.math3.analysis.function.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;




public class DepartureCalendarClick{
	WebDriver driver;
	private static Logger Log = LogManager.getLogger(DepartureCalendarClick.class.getName());
	@Test
	public void departureCalendarClick_() {
		 Log.info("Entering into application");
		System.setProperty("webdriver.chrome.driver", "E:\\Test\\AutomationTestingProject\\src\\test\\resources\\Chrome\\chromedriver.exe");
		Log.info("Opening chrome driver");
		driver=new ChromeDriver();

		driver.get("http://43.254.161.195:8085/happytripcrclean1");
		driver.findElement(By.partialLinkText("in as")).click();
		driver.findElement(By.id("username")).sendKeys("admin@mindtree.com");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.id("signInButton")).click();
		driver.findElement(By.partialLinkText("Schedule Flight")).click();
		WebElement departure = driver.findElement(By.className("ui-datepicker-trigger"));
		departure.click();
		driver.findElement(By.partialLinkText("6")).click();
		
		} 
}
