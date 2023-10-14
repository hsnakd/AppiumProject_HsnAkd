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

    @AndroidFindBy(xpath = "//*[@id='global-enhancements-search-query']")
    public MobileElement searchBox;

    @AndroidFindBy(accessibility = "search_query")
    public MobileElement searchField;

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
