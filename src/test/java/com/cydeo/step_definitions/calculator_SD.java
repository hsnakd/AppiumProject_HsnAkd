package com.cydeo.step_definitions;

import com.cydeo.pages.CalculatorPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class calculator_SD {

    CalculatorPage calculatorPage = new CalculatorPage();




    @Given("go to page")
    public void go_to_page() {
        int num1 = 5;
        char operator = '+';
        int num2 = 8;
        int expectedResult = 0;

        calculatorPage.calculator(num1, operator, num2);

        String result = calculatorPage.result.getText();
        System.out.println("result = " + result);

        if (operator == '*') {
            expectedResult = num1*num2;
        } else if (operator == '/') {
            expectedResult = num1/num2;
        } else if (operator == '+') {
            expectedResult = num1+num2;
        } else if (operator == '-') {
            expectedResult = num1-num2;
        }else {
            System.out.println("Wrong Operator");
        }

        assertEquals(expectedResult, Integer.parseInt(result) );

    }

    @When("on the home gape")
    public void on_the_home_gape() {
        // Implement the code for the home page verification
    }

    @Then("GetMethods")
    public void get_methods() {
        // Implement the code for the GetMethods verification
    }




}

