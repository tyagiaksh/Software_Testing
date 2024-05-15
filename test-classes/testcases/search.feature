Feature: Search functionality

  As a user
  I want to be able to search for content on the website
  So that I can find the information I'm looking for

  Scenario: Search for content on the website
    Given I am on the home page of the website
    When I click on the search bar
    And a div opens with a search input
    Then the search results are displayed