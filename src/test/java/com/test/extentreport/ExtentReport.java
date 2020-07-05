package com.test.extentreport;


	import java.io.IOException;
	import java.net.MalformedURLException;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.Test;

	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.MediaEntityBuilder;

	import com.aventstack.extentreports.Status;
	import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.skillassure.training.tests.AddFlightDetails;
import com.skillassure.training.tests.ArrivalCalendarClick;
import com.skillassure.training.tests.ArrivalCalendarSelect;
import com.skillassure.training.tests.ArrivalTimeClick;
import com.skillassure.training.tests.ChooseFlight;
import com.skillassure.training.tests.CostOfClass;
import com.skillassure.training.tests.DepartureCalendarSelect;
import com.skillassure.training.tests.DepartureTimeClick;
import com.skillassure.training.tests.DepartureCalendarClick;
import com.skillassure.training.tests.Route;
import com.skillassure.training.tests.ScheduleFlight;

	

	 
	public class ExtentReport {
		ExtentHtmlReporter htmlReporter;
		ExtentReports extent;
		static ExtentTest test;
		
		@BeforeSuite
		public void setUp() {
			// start reporters
			htmlReporter = new ExtentHtmlReporter("extent.html");

			// create ExtentReports and attach reporter(s)
			 extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
			
		} 
		
		@Test
		public void test1() throws IOException {
		     // creates a toggle for the given test, adds all log events under it    
	        ExtentTest test = extent.createTest("RouteTest", "Sample description");
	        
	        Route rt = new Route();
	        
	        rt.route_();
	        
	        // log(Status, details)
	        test.log(Status.INFO, "This step shows usage of log(status, details)");

	        // info(details)
	        test.info("This step shows usage of info(details)");
	        
	        // log with snapshot
	        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	        
	        // test with snapshot
	        test.addScreenCaptureFromPath("screenshot.png");
		}
		
		@Test
		public void test2() throws IOException {
		     // creates a toggle for the given test, adds all log events under it    
	        ExtentTest test = extent.createTest("ScheduleFlight", "Sample description");
	        
	       ScheduleFlight cf=new ScheduleFlight();
	        
	        cf.signin();
	        
	        // log(Status, details)
	        test.log(Status.INFO, "This step shows usage of log(status, details)");

	        // info(details)
	        test.info("This step shows usage of info(details)");
	        
	        // log with snapshot
	        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	        
	        // test with snapshot
	        test.addScreenCaptureFromPath("screenshot.png");
		}
		
		@Test
		public void test3() throws IOException {
		     // creates a toggle for the given test, adds all log events under it    
	        ExtentTest test = extent.createTest("DepartureCalendarClick", "Sample description");
	        
	        DepartureCalendarClick dc = new DepartureCalendarClick();
	     
	        dc.departureCalendarClick_();
	        // log(Status, details)
	        test.log(Status.INFO, "This step shows usage of log(status, details)");

	        // info(details)
	        test.info("This step shows usage of info(details)");
	        
	        // log with snapshot
	        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	        
	        // test with snapshot
	        test.addScreenCaptureFromPath("screenshot.png");
		}
		
		@Test
		public void test4() throws IOException {
		     // creates a toggle for the given test, adds all log events under it    
	        ExtentTest test = extent.createTest("Departure time", "Sample description");
	        
	        DepartureTimeClick dt=new DepartureTimeClick();
	        
	        dt.departuretime();
	       
	        
	        // log(Status, details)
	        test.log(Status.INFO, "This step shows usage of log(status, details)");

	        // info(details)
	        test.info("This step shows usage of info(details)");
	        
	        // log with snapshot
	        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	        
	        // test with snapshot
	        test.addScreenCaptureFromPath("screenshot.png");
		}
		
		@Test
		public void test5() throws IOException {
		     // creates a toggle for the given test, adds all log events under it    
	        ExtentTest test = extent.createTest("departureCalendardateSelect", "Sample description");
	        
	        DepartureCalendarSelect dp=new DepartureCalendarSelect();
	        dp.depatureCalendarClick_();
	        
	        // log(Status, details)
	        test.log(Status.INFO, "This step shows usage of log(status, details)");

	        // info(details)
	        test.info("This step shows usage of info(details)");
	        
	        // log with snapshot
	        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	        
	        // test with snapshot
	        test.addScreenCaptureFromPath("screenshot.png");
		}
		
		@Test
		public void test6() throws Exception {
		     // creates a toggle for the given test, adds all log events under it    
	        ExtentTest test = extent.createTest("Arrival time Click", "Sample description");
	        
	       ArrivalTimeClick at= new ArrivalTimeClick();
	        
	       at.ArrivalTimeClick_();
	        // log(Status, details)
	        test.log(Status.INFO, "This step shows usage of log(status, details)");

	        // info(details)
	        test.info("This step shows usage of info(details)");
	        
	        // log with snapshot
	        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	        
	        // test with snapshot
	        test.addScreenCaptureFromPath("screenshot.png");
		}
		
		@Test
		public void test7() throws IOException {
		     // creates a toggle for the given test, adds all log events under it    
	        ExtentTest test = extent.createTest("Arrival calendar date select", "Sample description");
	        
	        ArrivalCalendarSelect ar=new ArrivalCalendarSelect();
	        
	        ar.ArrivalCalendarSelect();
	        
	        // log(Status, details)
	        test.log(Status.INFO, "This step shows usage of log(status, details)");

	        // info(details)
	        test.info("This step shows usage of info(details)");
	        
	        // log with snapshot
	        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	        
	        // test with snapshot
	        test.addScreenCaptureFromPath("screenshot.png");
		}
		
		@Test
		public void test8() throws Exception {
		     // creates a toggle for the given test, adds all log events under it    
	        ExtentTest test = extent.createTest("Arrival calendar click", "Sample description");
	        
	       ArrivalCalendarClick ar=new ArrivalCalendarClick();
	       
	       ar.ArrivalCalendarClick_();
	        
	        // log(Status, details)
	        test.log(Status.INFO, "This step shows usage of log(status, details)");

	        // info(details)
	        test.info("This step shows usage of info(details)");
	        
	        // log with snapshot
	        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	        
	        // test with snapshot
	        test.addScreenCaptureFromPath("screenshot.png");
		}
		
		@Test
		public void test9() throws Exception {
		     // creates a toggle for the given test, adds all log events under it    
	        ExtentTest test = extent.createTest("check for block of cost of class", "Sample description");
	        
	        CostOfClass co=new CostOfClass();
	        
	        co.scheduleFlight();
	        
	        // log(Status, details)
	        test.log(Status.INFO, "This step shows usage of log(status, details)");

	        // info(details)
	        test.info("This step shows usage of info(details)");
	        
	        // log with snapshot
	        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	        
	        // test with snapshot
	        test.addScreenCaptureFromPath("screenshot.png");
		}
		
		@Test
		public void test10() throws Exception {
		     // creates a toggle for the given test, adds all log events under it    
	        ExtentTest test = extent.createTest("Adding the complete flight details", "Sample description");
	        
	        AddFlightDetails ad=new AddFlightDetails();

	        ad.scheduleFlight();
	        
	        // log(Status, details)
	        test.log(Status.INFO, "This step shows usage of log(status, details)");

	        // info(details)
	        test.info("This step shows usage of info(details)");
	        
	        // log with snapshot
	        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	        
	        // test with snapshot
	        test.addScreenCaptureFromPath("screenshot.png");
		}
		
//		@AfterSuite
//		public void tearDown() throws MalformedURLException, EmailException {
//			extent.flush();
//			Emai
//		
//		}
		
		

	}

