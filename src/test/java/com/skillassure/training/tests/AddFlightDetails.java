package com.skillassure.training.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;



import org.testng.annotations.Test;
//
//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;



public class AddFlightDetails {
	
	private static Logger Log = LogManager.getLogger(AddFlightDetails.class.getName());
	WebDriver driver;
	
	
	@Test
	public void scheduleFlight() {
		
		// Admin sign in
		Log.info("entering as admin");
		
		// getting into schedule flight page
		Log.info("Selecting the flight from dropdown");
		System.setProperty("webdriver.chrome.driver", "E:\\Test\\AutomationTestingProject\\src\\test\\resources\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.get("http://43.254.161.195:8085/happytripcrclean1");
		driver.findElement(By.partialLinkText("in as")).click();
		driver.findElement(By.id("username")).sendKeys("admin@mindtree.com");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.id("signInButton")).click();
		driver.findElement(By.partialLinkText("Schedule Flight")).click();
		WebElement chooseflight = driver.findElement(By.xpath("//*[@id=\"flight\"]"));
		chooseflight.click();
		//Selecting the flight
		Select flight = new Select(driver.findElement(By.xpath("//*[@id=\"flight\"]")));
		//By index
		flight.selectByIndex(2);
		//choosing the route
		Log.info("selecting the route");
		WebElement route = driver.findElement(By.xpath("//*[@id=\"route\"]"));
		route.click();
		route.sendKeys("Surat(Gujarat) - bangaluru(Karnataka)");
		
		//adding the distance
		//Log.info("adding the distance ");
		driver.findElement(By.id("distance")).sendKeys("245");
		
		//departure date
		//Log.info("selecting the departure date");
		WebElement calendar = driver.findElement(By.xpath("//*[@id=\"AddSchedule\"]/dl/dd[6]/img"));
		calendar.click();
		WebElement date=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[5]/a"));
		date.click();
		
		//departure time
		Log.info("selecting the departure time");
		WebElement dptTime=driver.findElement(By.id("departureTime"));
		dptTime.click();
		
		driver.findElement(By.xpath("//*[@id=\"departureTime\"]/option[7]")).click();
		
		//Arrival date
		//Log.info("selecting the arrival date");
		WebElement calendar_ =driver.findElement(By.xpath("//*[@id=\"AddSchedule\"]/dl/dd[8]/img"));
		calendar_.click();
		
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[4]/a")).click();
		
		//Arrival Time
		Log.info("selecting the arrival time");
		WebElement dptTime_=driver.findElement(By.id("arrivalTime"));
		dptTime_.click();
		
		driver.findElement(By.xpath("//*[@id=\"arrivalTime\"]/option[3]")).click();
		
		//Cost of economy 
		Log.info("adding the cost of economy");
		driver.findElement(By.id("classEconomy")).sendKeys("8454");
		
		Log.info("finally adding the flight");
		driver.findElement(By.partialLinkText("Add")).click();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//data.driver.close();
	}
	

}