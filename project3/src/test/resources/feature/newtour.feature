Feature: working on newtours page

  Scenario: web application
    Given user is in newtours page
    When user enters uname and password
    Then user clicks login button
    And user back to home page
