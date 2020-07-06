package com.skillassure.training.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


//import testcases.excel;

public class CostOfClass {
	 private static Logger Log = LogManager.getLogger(CostOfClass.class.getName());
	 WebDriver driver;
	//Data ex=new Data();
	String expected ="1";
	@Test
	public void scheduleFlight(){
		Log.info("Entering the application");
		System.setProperty("webdriver.chrome.driver", "E:\\Test\\AutomationTestingProject\\src\\test\\resources\\Chrome\\chromedriver.exe");
		Log.info("Opening chrome driver");
		driver=new ChromeDriver();
		
		driver.get("http://43.254.161.195:8085/happytripcrclean1");
		driver.findElement(By.partialLinkText("in as")).click();
		driver.findElement(By.id("username")).sendKeys("admin@mindtree.com");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.id("signInButton")).click();
		driver.findElement(By.partialLinkText("Schedule Flight")).click();
		
		WebElement chooseflight = driver.findElement(By.xpath("//*[@id=\"flight\"]"));
		chooseflight.click();
		Select flight = new Select(driver.findElement(By.xpath("//*[@id=\"flight\"]")));
		
		flight.selectByIndex(2);
		
		boolean test=driver.findElement(By.id("classEconomy")).isDisplayed();
		
		System.out.println("Cost of class : " + test);
		driver.navigate().refresh();
		
		
	} 
}