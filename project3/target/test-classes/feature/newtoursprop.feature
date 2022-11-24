Feature: working on web application

  Scenario: newtours web app
    Given user is in newtours
    When user needs to enter username and password
    Then user clicks on submit button
    And user takes the screenshot and close the page
