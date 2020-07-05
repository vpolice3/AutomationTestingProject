package com.skillassure.training.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



//import testcases.excel;

public class Route extends Data {
	
	 private static Logger Log = LogManager.getLogger(Route.class.getName());
	Data ex=new Data();
	String baseUrl ="http://43.254.161.195:8085/happytripcrclean1";
	
	@Test
	public void route_() {
		Log.info("entering as admin");
		//ex.login("Admin@mindtree.com", "admin");
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
		
		Log.info("Choosing the route");
		WebElement route = driver.findElement(By.id("route"));
		route.click();
		//Log.info("selecting the route");
		route.sendKeys("Surat(Gujarat) - bangaluru(Karnataka)");
		driver.navigate().refresh();
		
//		Log.info("closing the webpage");
//		ex.driver.close();
		
}
}