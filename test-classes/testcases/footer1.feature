Feature: Div functionality

  As a user
  I want to be able to click on the links in a div
  And be taken to the correct pages
  So that I can access the content of the pages

  Scenario: Check if all the links in a div are working
    Given I am on the home page Footer
    When I click on the "Links" Div
    Then I am taken to the Loop