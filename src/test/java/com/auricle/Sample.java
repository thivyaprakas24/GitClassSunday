package com.auricle;

import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Sample {

	public static void main(String[] args) throws IOException, InterruptedException {

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setPlatform(Platform.ANDROID);
		caps.setVersion("12");
		caps.setCapability("appium:deviceName", "Galaxy A22");
		caps.setCapability("appium:appPackage", "com.app.auricle");
		caps.setCapability("appium:appActivity", "com.app.auricle.MainActivity");
		caps.setCapability("appium:automationName", "UiAutomator2");
		WebDriver driver = new AppiumDriver(caps);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("id_nextscreen")).click();
		driver.findElement(By.id("id_next")).click();
		driver.findElement(By.id("id_next")).click();
		driver.findElement(By.id("id_next")).click();
		driver.findElement(By.xpath("//*[@text='Done']")).click();
		driver.findElement(By.id("btnStartNow")).click();
		driver.findElement(By.id("edtNumber")).sendKeys("8124327253");
		driver.findElement(By.id("btnSendOtp")).click();

//		Thread.sleep(5000);
//
//		try {
//			Process process = Runtime.getRuntime()
//					.exec("adb shell content query --uri content://sms/inbox --projection body,date");
//
//			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
//			String line;
//			long latestDate = 0;
//			String latestOTP = null;
//
//			// Regex to find 4-digit OTP (adjust if needed)
//			Pattern otpPattern = Pattern.compile("\\b\\d{4}\\b");
//
//			while ((line = reader.readLine()) != null) {
//				if (line.contains("Auricle app")) { // Filter for relevant messages
//					String[] parts = line.split(" ");
//					String body = null;
//					long date = 0;
//
//					for (String part : parts) {
//						if (part.startsWith("body=")) {
//							body = part.replace("body=", "").replace("\"", "");
//						} else if (part.startsWith("date=")) {
//							try {
//								date = Long.parseLong(part.replace("date=", ""));
//							} catch (NumberFormatException ignored) {
//							}
//						}
//					}
//
//					if (body != null && date > latestDate) {
//						Matcher matcher = otpPattern.matcher(body);
//						if (matcher.find()) {
//							latestOTP = matcher.group();
//							latestDate = date;
//						}
//					}
//				}
//			}
//
//			if (latestOTP != null) {
//				System.out.println("Latest OTP: " + latestOTP);
//			} else {
//				System.out.println("No OTP found in relevant messages.");
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}

}
