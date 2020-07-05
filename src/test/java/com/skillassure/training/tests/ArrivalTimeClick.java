package com.skillassure.training.tests;


import org.apache.commons.math3.analysis.function.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ArrivalTimeClick {
	WebDriver driver;
	@Test
	public void ArrivalTimeClick_() {
		System.setProperty("webdriver.chrome.driver", "E:\\Test\\AutomationTestingProject\\src\\test\\resources\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.get("http://43.254.161.195:8085/happytripcrclean1");
		driver.findElement(By.partialLinkText("in as")).click();
		driver.findElement(By.id("username")).sendKeys("admin@mindtree.com");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.id("signInButton")).click();
		driver.findElement(By.partialLinkText("Schedule Flight")).click();

		WebElement dptTime=driver.findElement(By.id("arrivalTime"));
		dptTime.click();

		boolean test=driver.findElement(By.xpath("//*[@id=\"arrivalTime\"]/option[3]")).isDisplayed();
		System.out.println("Arrival time is selected: "+ test);

	}
}