@EtsyChromeTest
Feature: Etsy Chrome Test
  @EtsyChromeTest-1
  Scenario: Search for a product on Etsy
    Given I navigate to the Etsy homepage
    When I search for "wooden spoon"
    Then I should see search results

  @EtsyChromeTest-2
  Scenario: Login to Etsy
    Given I am on the Etsy login page
    When I enter my email "your_email@example.com"
    And I enter my password "your_password"
    Then I should be logged in


  #/Users/HSN/IdeaProjects/AppiumProject_HsnAkd/chromedriver