package com.cydeo.step_definitions;

import com.cydeo.pages.CalculatorPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class calculatorTest_SD {

    CalculatorPage calculatorPage = new CalculatorPage();


    @Given("I have entered first number {int} into the calculator")
    public void iHaveEnteredFirstNumberIntoTheCalculator(int num1) {
        calculatorPage.clickSingleDigit(num1);
    }

    @And("I have entered second number {int} into the calculator")
    public void iHaveEnteredSecondNumberIntoTheCalculator(int num2) {
        calculatorPage.clickSingleDigit(num2);
    }



    @When("I press the add button")
    public void iPressTheAddButton() {
        calculatorPage.plus.click();
    }

    @Then("the result should be {int} on the screen")
    public void theResultShouldBeOnTheScreen(int expectedResult) {
        String actualResult = calculatorPage.result.getText();
        System.out.println("expectedResult = " + expectedResult);
        System.out.println("actualResult = " + actualResult);

        assertEquals(expectedResult, Integer.parseInt(actualResult) );
    }

    @When("I press the subtract button")
    public void iPressTheSubtractButton() {
        calculatorPage.minus.click();
    }

    @When("I press the multiply button")
    public void iPressTheMultiplyButton() {
        calculatorPage.multiply.click();
    }

    @When("I press the divide button")
    public void iPressTheDivideButton() {
        calculatorPage.divide.click();
    }

    @And("the calculator should not display an error")
    public void theCalculatorShouldNotDisplayAnError() {
    }


    @When("I click the equal sign")
    public void iClickTheEqualSign() {
        calculatorPage.equals.click();
    }

    @And("I press the {string} button")
    public void iPressTheButton(String operator) {
        char charOperator = operator.charAt(0);

        if (charOperator == '*') {
            calculatorPage.multiply.click();
        } else if (charOperator == '/') {
            calculatorPage.divide.click();
        } else if (charOperator == '+') {
            calculatorPage.plus.click();
        } else if (charOperator == '-') {
            calculatorPage.minus.click();
        }else {
            System.out.println("Wrong Operator");
        }

    }


    @Given("I have entered {string} into the calculator")
    public void iHaveEnteredIntoTheCalculator(String num) {
        calculatorPage.clickSingleDigit(Integer.parseInt(num));
    }

    @Then("the result should be {string} on the screen")
    public void theResultShouldBeOnTheScreen(String expectedResult) {
        String actualResult = calculatorPage.result.getText();
        System.out.println("expectedResult = " + expectedResult);
        System.out.println("actualResult = " + actualResult);

        assertEquals(Integer.parseInt(expectedResult), Integer.parseInt(actualResult) );
    }
}


