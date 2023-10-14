package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class EtsyAppPage {
    public EtsyAppPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(id = "com.etsy.android:id/btn_sign_in_dialog")
    public MobileElement signInDialog;

    @AndroidFindBy(id = "com.etsy.android:id/clg_text_input")
    public MobileElement inputBox;

    @AndroidFindBy(id = "com.etsy.android:id/sign_in_button_email")
    public MobileElement signInButton;

    @AndroidFindBy(id = "welcomeMessage")
    public MobileElement welcomeMessage;

    @AndroidFindBy(id = "aria-join_neu_email_field-error")
    public MobileElement errorMessage;

    @AndroidFindBy(accessibility = "multiply")
    public MobileElement multiply;



    public void multiply() {
        multiply.click();
    }


}
