package com.testrunners;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.Reporter;

import io.cucumber.junit.Cucumber;

//import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src/test/resources/Feature/freshfruits.feature",
				plugin = {"pretty",
						"html:Reports/cucumber-html-report", 
						"json:Reports/cucumber-html-report/jsonreport.json",
						"rerun:target/cucumber-reports/rerun.txt",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						//"testng:target/testng-cucumber-reports/cuketestng.xml",
						},
		glue= {"com.stepdefinitions"}
		
		
		//strict= true
					
		)
public class TestRunner {
	//create the report-extent-config.xml
	 public static void Extentsreport()
	  
	  {
	  Reporter.loadXMLConfig("/src/test/resources/Log4jProperties/Extent-config.xml");
	  Reporter.setSystemInfo("user", System.getProperty("user.name"));
	  Reporter.setSystemInfo("os", "Windows");
	  Reporter.setTestRunnerOutput("Project Natural Report"); }

}