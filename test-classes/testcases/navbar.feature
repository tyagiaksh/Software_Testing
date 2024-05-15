Feature: Navbar functionality
  As a user
  I want to be able to hover over a button in the navbar
  And see the corresponding div
  So that I can access the content of the div

  Scenario: Hover over a button in the navbar
    Given I am on the home page
    When I hover over the "About" button in the navbar
    Then the "about-div" is displayed