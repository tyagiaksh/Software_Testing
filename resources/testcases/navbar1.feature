Feature: Navbar functionality
  As a user
  I want to be able to hover over a button in the navbar
  And see the corresponding div
  So that I can access the content of the div

  Scenario: Hover over a button in the navbar
    Given I am on the home page 1
    When I hover over the "Acclerator" button in the navbar 1
    Then the "acclerator-div" is displayed 1