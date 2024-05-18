Feature: Navigation to home page

  As a user
  I want to be able to navigate to the home page of the website
  So that I can access the main content of the site

  Scenario: Navigate to home page by clicking on logo
    Given I am on a random page of the website
    When I click on the logo
    Then I am taken to the home page of the website