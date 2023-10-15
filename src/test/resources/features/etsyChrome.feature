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
    When I enter my email "your_emaxaxil@exsza.com"
    And I enter my password "youxaxr_pasxswdxadord123*1sa"
    Then I should be logged in
    Then verify welcome message displayed


  #/Users/HSN/IdeaProjects/AppiumProject_HsnAkd/chromedriver