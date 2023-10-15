Feature: Etsy App Login
  @EtsyAppLogin
  Scenario: User logs in to the Etsy app
    Given the app is launched
    When the user clicks on the sign-in button
    And enters the email "areatha@uspeakw.com"
    And clicks on the continue button
    Then the user should be logged in successfully

#EtsyApp
#  configuration.properties ==>   platform=androidEtsyApp
#  Driver class
#  ==>   desiredCapabilities.setCapability(MobileCapabilityType.APP, "https://cybertek-appium.s3.amazonaws.com/etsy.apk" );
#  or
#  ==>   desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/HSN/IdeaProjects/AppiumProject_HsnAkd/etsy.apk" );
