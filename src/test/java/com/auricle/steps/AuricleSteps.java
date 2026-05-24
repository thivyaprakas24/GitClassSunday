package com.auricle.steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.auricle.utility.BaseClass;

import io.cucumber.java.en.*;

public class AuricleSteps extends BaseClass {
	@Given("User is on auricle application")
	public void userIsOnAuricleApplication() {

	}

	@When("User click next button and done button and click on start now button")
	public void userClickNextButtonAndDoneButtonAndClickOnStartNowButton() {
		elementClick(driver.findElement(By.id("id_nextscreen")));
		elementClick(driver.findElement(By.id("id_next")));
		elementClick(driver.findElement(By.id("id_next")));
		elementClick(driver.findElement(By.id("id_next")));
		elementClick(driver.findElement(By.xpath("//*[@text='Done']")));
		elementClick(driver.findElement(By.id("btnStartNow")));
	}

	@Then("User verify {string} message is displayed")
	public void userVerifyMessageIsDisplayed(String expMessage) {

		String actualMessage = getElementText(driver
				.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.app.auricle:id/textView\"]")));
		Assert.assertEquals("verify message from otp page", expMessage, actualMessage);

	}

	@Then("User enters Phone number click on send otp button and enter otp click on Verify button")
	public void userEntersPhoneNumberClickOnSendOtpButtonAndEnterOtpClickOnVerifyButton() {

		elementSendKeys(driver.findElement(By.id("edtNumber")), "6383195631");
		elementClick(driver.findElement(By.id("btnSendOtp")));

		elementClick(driver.findElement(By.xpath(
				"//android.view.ViewGroup[@resource-id=\"com.app.auricle:id/main\"]/android.widget.ImageView[2]")));
		elementClick(
				driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.app.auricle:id/idOtp\"]")));

	}

	@Then("User click on vidoes option from navigation bar")
	public void userClickOnVidoesOptionFromNavigationBar() {
	}

	@Then("User verify videos page is displayed")
	public void userVerifyVideosPageIsDisplayed() {
	}

}
