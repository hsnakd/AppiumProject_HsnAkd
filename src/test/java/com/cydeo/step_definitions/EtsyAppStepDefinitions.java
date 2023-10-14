package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyAppPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class EtsyAppStepDefinitions {

    private AppiumDriver<MobileElement> driver;
    EtsyAppPage etsyAppPage = new EtsyAppPage();


    @Given("the app is launched")
    public void the_app_is_launched() {
        // Assuming you have a method in your Driver class to get the driver
        System.out.println(Driver.getDriver().getDeviceTime());
    }

    @When("the user clicks on the sign-in button")
    public void the_user_clicks_on_the_sign_in_button() {
        // Click on the sign-in button
        etsyAppPage.signInDialog.click();
    }

    @When("enters the email {string}")
    public void enters_the_email(String email) throws InterruptedException {
        Thread.sleep(2000);
        // Assuming there is an element with id "com.etsy.android:id/clg_text_input" for email input
        etsyAppPage.inputBox.sendKeys(email);
    }

    @When("clicks on the continue button")
    public void clicks_on_the_continue_button() throws InterruptedException {
        Thread.sleep(2000);
        // Assuming there is an element with id "com.etsy.android:id/sign_in_button_email" for continue button
        Driver.getDriver().hideKeyboard();  // to hide the keyboard of application, it is preventing continue button
        Thread.sleep(2000);
        etsyAppPage.signInButton.click();
    }

    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() throws InterruptedException {
        // You might want to add assertions or verifications here
        // For example, check if a welcome message is displayed
        // Assuming there is an element with id "welcomeMessage"
        Thread.sleep(2000);
//        System.out.println("etsyAppPage.welcomeMessage = " + etsyAppPage.welcomeMessage.getText());
//        System.out.println("etsyAppPage.errorMessage = " + etsyAppPage.errorMessage.getText());
//        assert etsyAppPage.welcomeMessage.isDisplayed();
//        assert etsyAppPage.errorMessage.isDisplayed();
    }

}
