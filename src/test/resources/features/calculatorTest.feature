@Calculator
Feature: Calculator Operations
  As a user
  I want to perform basic calculations
  So that I can use the calculator for simple arithmetic

  @Addition
  Scenario: Addition
    Given I have entered first number 5 into the calculator
    And I press the add button
    And I have entered second number 7 into the calculator
    When I click the equal sign
    Then the result should be 12 on the screen

  @Subtraction
  Scenario: Subtraction
    Given I have entered first number 7 into the calculator
    And I press the subtract button
    And I have entered second number 5 into the calculator
    When I click the equal sign
    Then the result should be 2 on the screen

  @Multiplication
  Scenario: Multiplication
    Given I have entered first number 7 into the calculator
    And I press the multiply button
    And I have entered second number 5 into the calculator
    When I click the equal sign
    Then the result should be 35 on the screen

  @Division
  Scenario: Division
    Given I have entered first number 8 into the calculator
    And I press the divide button
    And I have entered second number 4 into the calculator
    When I click the equal sign
    Then the result should be 2 on the screen


  @Operator
  Scenario Outline: Calculator
    Given I have entered "<first number>" into the calculator
    And I press the "<operator>" button
    And I have entered "<second number>" into the calculator
    When I click the equal sign
    Then the result should be "<result>" on the screen
    Examples:
      | first number | operator | second number | result |
      | 8            | +        | 2             | 10     |
      | 8            | -        | 2             | 6      |
      | 8            | *        | 2             | 16     |
      | 8            | /        | 2             | 4      |


