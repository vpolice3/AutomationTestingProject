package com.skillassure.training.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ArrivalCalendarSelect {
	WebDriver driver;
	private static Logger Log = LogManager.getLogger(ArrivalCalendarSelect.class.getName());
@Test
	public void ArrivalCalendarSelect() {
		try {
			Log.info("Enter the application");
			System.setProperty("webdriver.chrome.driver", "E:\\Test\\AutomationTestingProject\\src\\test\\resources\\Chrome\\chromedriver.exe");
			driver=new ChromeDriver();
			Log.info("opening an application");
			driver.get("http://43.254.161.195:8085/happytripcrclean1");
			Log.info("Clicking on login as admin");
			driver.findElement(By.partialLinkText("in as")).click();
			driver.findElement(By.id("username")).sendKeys("admin@mindtree.com");
			driver.findElement(By.id("password")).sendKeys("admin");
			driver.findElement(By.id("signInButton")).click();
			driver.findElement(By.partialLinkText("Schedule Flight")).click();
		WebElement calendar = driver.findElement(By.xpath("//*[@id=\"AddSchedule\"]/dl/dd[8]/img"));
		calendar.click();
		
		//Log.info("Checking for selecting the Arrival date");
		WebElement date=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[2]/a"));
		date.click();
		
		boolean test=driver.findElement(By.id("arrivalDate")).isDisplayed();
		System.out.println("Arrival date is selected: "+ test);
		driver.close();
}
		catch(Throwable e) {
			System.out.println("Java erro is :"+e);
			e.printStackTrace();
		}
}
}
