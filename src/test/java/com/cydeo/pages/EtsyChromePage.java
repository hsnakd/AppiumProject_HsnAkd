package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class EtsyChromePage {
    public EtsyChromePage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(xpath = "//*[@id='join_neu_email_field']")
    public MobileElement emailField;

    @AndroidFindBy(xpath = "//*[@id='join_neu_password_field']")
    public MobileElement passwordField;

    @AndroidFindBy(id = "com.etsy.android:id/sign_in_button_email")
    public MobileElement signInButton;

    @AndroidFindBy(accessibility = "multiply")
    public MobileElement multiply;




}
