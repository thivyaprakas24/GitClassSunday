package com.auricle.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.auricle.report.Report;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features", glue = "com.auricle.steps", dryRun = false, snippets = SnippetType.CAMELCASE, plugin = {
		"html:target\\auricle.html", "json:target\\output.json" })
public class TestRunner {

	@AfterClass
	public static void afterExecution() {

		Report.generateJVMReport(System.getProperty("user.dir") + "\\target\\output.json");

	}

}
