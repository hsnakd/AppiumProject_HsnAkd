package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyChromePage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EtsyChromeStepDefinitions  {

    EtsyChromePage etsyChromePage = new EtsyChromePage();


    @Given("I navigate to the Etsy homepage")
    public void iNavigateToTheEtsyHomepage() {
//        System.out.println("Driver instance: " + Driver.getDriver());
        Driver.getDriver().get("https://www.etsy.com");    }

    @When("I search for {string}")
    public void iSearchFor(String searchTerm) throws InterruptedException {
        Thread.sleep(3000);
        WebElement searchField = Driver.getDriver().findElement(By.xpath("//*[@name='search_query']"));
        searchField.sendKeys(searchTerm + Keys.ENTER);

//        etsyChromePage.searchField.sendKeys(searchTerm + Keys.ENTER);
    }

    @Then("I should see search results")
    public void iShouldSeeSearchResults() throws InterruptedException {
        Thread.sleep(3000);
        //print number of results
        WebElement results = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'results,')]"));
        System.out.println("results.getText() = " + results.getText());
    }














    @Given("I am on the Etsy login page")
    public void iAmOnTheEtsyLoginPage() {
        Driver.getDriver().get("https://www.etsy.com");
        WebElement signIn = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'Sign in')]/.."));
        signIn.click();
    }

    @When("I enter my email {string}")
    public void iEnterMyEmail(String email) {
        WebElement userNameField = Driver.getDriver().findElement(By.name("email"));
        userNameField.sendKeys(email + Keys.ENTER);
    }

    @When("I enter my password {string}")
    public void iEnterMyPassword(String password) throws InterruptedException {
        Thread.sleep(3000);
        WebElement passwordField = Driver.getDriver().findElement(By.name("password"));
        passwordField.sendKeys(password + Keys.ENTER);
    }

    @Then("I should be logged in")
    public void iShouldBeLoggedIn() {
        // Add assertion or validation for successful login
    }
}
