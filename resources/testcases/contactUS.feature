Feature: Form validation
  As a user
  I want to be prompted to enter required details if I click next without filling any details
  So that I can complete the form correctly

  Scenario: Click next without filling any details
    Given I am on the form Page 1
    When I click on the next Button 1
    Then An error message is displayed saying "Please fill in all the fields before proceeding." 1