package com.auricle.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report {

	public static void generateJVMReport(String jsonFile) {

		File reportDirectory = new File(System.getProperty("user.dir") + "\\target");

		Configuration configuration = new Configuration(reportDirectory, "AuricleMobileApp");
		configuration.addClassifications("author", "Aravinda Kumar");

		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);

		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		builder.generateReports();

	}

	private void apiTesting() {
		System.out.println("POSTMAN");

	}

	private void mobileTesting() {
		System.out.println("APPIUM");

	}

	private void webTesting() {
		System.out.println("SELENIUM");

	}

}
