package com.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

			features = "src/test/resources/features/apimethods.feature",
			glue = {"com.stepDefinitions" },
			plugin = {"pretty", "html:src/test/resources/Reports/cucumber-html-report",
//							"json:src/test/resources/Reports/cucumber-html-report/jsonreport",
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:Reports/"},
			
			monochrome = true

	)


	public class TestRunner extends AbstractTestNGCucumberTests{
	// 
//		@AfterClass
//	    public static void extendReport () throws UnsupportedEncodingException 
	//  {
////			ExtentReports extentReports = new ExtentReports(); extentReports.flush(); extentReports.setGherkinDialect("en");
//			 Reporter.setSystemInfo("user", System.getProperty("user name"));
//		        Reporter.setSystemInfo("os", "Mac OSX");
//		        Reporter.setTestRunnerOutput("Sample test runner output message");
	//  }
	 }


