package com.skillassure.training.tests;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class DepartureCalendarSelect {
	WebDriver driver;
	@Test
	public void depatureCalendarClick_() {
		System.setProperty("webdriver.chrome.driver", "E:\\Test\\AutomationTestingProject\\src\\test\\resources\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("http://43.254.161.195:8085/happytripcrclean1");
		driver.findElement(By.partialLinkText("in as")).click();
		driver.findElement(By.id("username")).sendKeys("admin@mindtree.com");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.id("signInButton")).click();
		driver.findElement(By.partialLinkText("Schedule Flight")).click();
		
		WebElement calendar = driver.findElement(By.xpath("//*[@id=\"AddSchedule\"]/dl/dd[6]/img"));
		calendar.click();
		WebElement date=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[1]/a"));
		date.click();
		
		boolean test=driver.findElement(By.id("departureDate")).isDisplayed();
		System.out.println("depature date is selected: "+ test);
		//ex.driver.close();
		
	} 
}