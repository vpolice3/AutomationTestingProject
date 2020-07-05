package com.skillassure.training.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.*;
import org.testng.annotations.DataProvider;

import jxl.Sheet;
import jxl.Workbook;
//import jxl.read.biff.BiffException;
import jxl.read.biff.BiffException;

public class Data {

WebDriver driver;
@BeforeTest
public void OpenApp()
{
   System.setProperty("webdriver.chrome.driver",  "E:/Test/AutomationTestingProject/src/test/resources/Chrome/chromedriver.exe");
   driver = new ChromeDriver();
   driver.navigate().to("http://43.254.161.195:8085/happytripcrclean1/");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}


@Test(dataProvider="empLogin")
public void login(String username, String password)
{
	WebElement loginasadmin = driver.findElement(By.partialLinkText("in as"));
	loginasadmin.click();
    WebElement login1 = driver.findElement(By.id("username"));
    login1.clear();
   login1.sendKeys(username);
   WebElement passwd=driver.findElement(By.id("password"));
   passwd.clear();
   passwd.sendKeys(password);
   driver.findElement(By.xpath("//*[@id=\"signInButton\"]")).click();
   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 
}

@DataProvider(name="empLogin")
 public Object[][] logindata()
{
    Object[][] arrayobject = getexceldata("E:/Test/AutomationTESTNG1/src/test/resources/Chrome/TestData1.xls","Sheet1");
    return arrayobject;
}

public String[][] getexceldata(String filename, String sheetname) 

{

   String[][] arrayexceldata = null;
   try
   {
   FileInputStream fis = new FileInputStream(filename);
   Workbook wb = Workbook.getWorkbook(fis);
   Sheet sh = wb.getSheet(sheetname);
   int row = sh.getRows();
   int col = sh.getColumns();
   arrayexceldata = new String[row-1][col];
   for (int i=1;i< row;i++)
   {
       for(int j=0;j<col;j++)
       {
           arrayexceldata[i-1][j]=sh.getCell(j,i).getContents();
       }
   }

   }
   catch (FileNotFoundException e) {
       e.printStackTrace();
   } catch (IOException e) {
       e.printStackTrace();
       e.printStackTrace();
   } catch (BiffException e) {
       e.printStackTrace();
   }
  return arrayexceldata;


}
}