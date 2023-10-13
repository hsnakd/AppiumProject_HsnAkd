package com.cydeo.tests;

import com.cydeo.pages.CalculatorPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorPOMTest {

    CalculatorPage calculatorPage = new CalculatorPage();

    /**
     * 5 * 8 = 40
     */
    @Test
    public void multiplyTest() {
        calculatorPage.clickSingleDigit(5);
        calculatorPage.multiply.click();
        calculatorPage.clickSingleDigit(8);
        calculatorPage.equals.click();
        String result = calculatorPage.result.getText();

        System.out.println("result = " + result);

        assertEquals(40, Integer.parseInt(result) );
    }

    @Test
    public void multiplyTest2() {
        int num1 = 5;
        int num2 = 8;
        calculatorPage.multiply(num1,num2);

        String result = calculatorPage.result.getText();
        System.out.println("result = " + result);

        assertEquals(num1*num2, Integer.parseInt(result) );
    }

    @Test
    public void calculatorTest() {
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
}
