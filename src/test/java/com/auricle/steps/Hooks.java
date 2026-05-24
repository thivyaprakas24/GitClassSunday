package com.auricle.steps;

import com.auricle.utility.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {

	private static ExtentReports reports;
	private static ExtentTest test;

	@Before
	public void beforeScenario(Scenario scenario) {

		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("target\\extent-report.html");
		htmlReporter.config().setTheme(com.aventstack.extentreports.reporter.configuration.Theme.DARK);
		htmlReporter.config().setReportName("Cucumber Test Execution Report");

		// Initialize ExtentReports
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);

		test = reports.createTest(scenario.getName());

		launchApp();
		implicitWait();
	}

	@After
	public void afterScenario(Scenario scenario) {
		scenario.attach(takeScreenshot(), "image/png", scenario.getName());

		if (scenario.isFailed()) {
			test.fail("Scenario Failed: " + scenario.getName());
		} else {
			test.pass("Scenario Passed: " + scenario.getName());
		}

		closeApp();
	}
}
