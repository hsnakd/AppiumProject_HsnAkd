@EtsyChromeLogin
Feature: Etsy Chrome Test

  @EtsyChromeTest-2
  Scenario: Login to Etsy
    Given I am on the Etsy login page
    When I enter my email "your_emaxaxil@exsza.com"
    And I enter my password "youxaxr_pasxswdxadord123*1sa"
    Then I should be logged in
    Then verify welcome message displayed


#EtsyChrome
#  configuration.properties ==>   platform=androidChrome


#  Driver class
#  ==>   desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
#  ==>   driver = new RemoteWebDriver(url, desiredCapabilities);  ????????????????????
#  ==>   driver = new AndroidDriver<>(url, desiredCapabilities);  ????????????????????
