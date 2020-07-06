package com.skillassure.training.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class DepartureTimeClick {
	WebDriver driver;
	private static Logger Log = LogManager.getLogger(DepartureTimeClick.class.getName());
	 @Test
	 public void departuretime() {
		 Log.info("Entering into application");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Test\\AutomationTestingProject\\src\\test\\resources\\Chrome\\chromedriver.exe");
		Log.info("Intializing chrome driver");
		driver=new ChromeDriver();
		
		driver.get("http://43.254.161.195:8085/happytripcrclean1");
		driver.findElement(By.partialLinkText("in as")).click();
		driver.findElement(By.id("username")).sendKeys("admin@mindtree.com");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.id("signInButton")).click();
		WebElement sc=driver.findElement(By.xpath("//*[@id=\"MainTabs\"]/li[5]/a"));
		sc.click();
		WebElement dt=driver.findElement(By.id("departureTime"));
		dt.click();
		dt.sendKeys("20.00");
		driver.navigate().refresh();
		
	}
}