@EtsyChromeSearch
Feature: Etsy Chrome Test

  @EtsyChromeTest-1
  Scenario: Search for a product on Etsy
    Given I navigate to the Etsy homepage
    When I search for "wooden spoon"
    Then I should see search results


#EtsyChrome
#  configuration.properties ==>   platform=androidChrome


#  Driver class
#  ==>   desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
#  ==>   driver = new RemoteWebDriver(url, desiredCapabilities);  ????????????????????
#  ==>   driver = new AndroidDriver<>(url, desiredCapabilities);  ????????????????????
