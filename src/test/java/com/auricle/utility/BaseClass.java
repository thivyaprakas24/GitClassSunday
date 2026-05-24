package com.auricle.utility;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class BaseClass {

	public static WebDriver driver;

	public void launchApp() {
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setPlatform(Platform.ANDROID);
		caps.setVersion("12");
		caps.setCapability("appium:deviceName", "Galaxy A22");
		caps.setCapability("appium:appPackage", "com.app.auricle");
		caps.setCapability("appium:appActivity", "com.app.auricle.MainActivity");
		caps.setCapability("appium:automationName", "UiAutomator2");
		driver = new AppiumDriver(caps);
	}

	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public void elementSendKeys(WebElement e, String data) {
		e.sendKeys(data);
	}

	public void elementClick(WebElement e) {
		e.click();
	}

	public void closeApp() {
		driver.quit();
	}

	public byte[] takeScreenshot() {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		return screenshot.getScreenshotAs(OutputType.BYTES);
	}

	public String getElementText(WebElement e) {
		return e.getText();
	}
}
