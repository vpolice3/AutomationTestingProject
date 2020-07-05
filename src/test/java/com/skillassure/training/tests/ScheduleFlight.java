package com.skillassure.training.tests;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;


//import data.ExcelData;

public class ScheduleFlight extends Data {
	WebDriver driver;
	String baseUrl="http://43.254.161.195:8085/happytripcrclean1";
	Map<String, Object[]> arrayexceldata;
	//String expected ="1";
//	String Username="Admin@mindtree.com";
//	String Password="admin";
	 private static Logger Log = LogManager.getLogger(ScheduleFlight.class.getName());
	@Test
	public void signin()
	{
		Log.debug("Execution Started");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Test\\AutomationTestingProject\\src\\test\\resources\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		
		Log.info("Maximizing the window");
		driver.manage().window().maximize();
		driver.navigate().to(baseUrl);
		driver.findElement(By.xpath("//*[@id=\"global\"]/li[2]/a")).click();

		Log.info("adding the credentials");
		driver.findElement(By.id("username")).sendKeys("admin@mindtree.com");
		driver.findElement(By.id("password")).sendKeys("admin");
		
		driver.findElement(By.id("signInButton")).click();
		
		Log.info("Clicking on schedule flight");
		driver.findElement(By.partialLinkText("Schedule Flight")).click();
		
	}
	
	

}