package com.cydeo.pages;

import com.cydeo.utils.Driver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {
    public CalculatorPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(accessibility = "multiply")
    public MobileElement multiply;

    @AndroidFindBy(accessibility = "divide")
    public MobileElement divide;

    @AndroidFindBy(accessibility = "plus")
    public MobileElement plus;

    @AndroidFindBy(accessibility = "minus")
    public MobileElement minus;

    @AndroidFindBy(accessibility = "equals")
    public MobileElement equals;

    @AndroidFindBy(id = "com.google.android.calculator:id/result_final")
    public MobileElement result;

    public void multiply() {
        multiply.click();
    }

    public void multiply(int num1, int num2) {
        clickSingleDigit(num1);
        multiply.click();
        clickSingleDigit(num2);
        equals.click();
    }

    public void calculator(int num1, char operator, int num2) {
        clickSingleDigit(num1);

        if (operator == '*') {
            multiply.click();
        } else if (operator == '/') {
            divide.click();
        } else if (operator == '+') {
            plus.click();
        } else if (operator == '-') {
            minus.click();
        }else {
            System.out.println("Wrong Operator");
        }

        clickSingleDigit(num2);
        equals.click();
    }

    public void clickSingleDigit(int digit) {
        String id = "com.google.android.calculator:id/digit_" + digit;
        MobileElement number = Driver.getDriver().findElement(By.id(id));
        number.click();
    }
}
