Feature: Page automationpractice. login correct

  Scenario: login correct

    Given the user is in home page
    When redirect to login page and add email and password correct
    Then redirect to my account page

  Scenario: login incorrect

    Given the user is in home page
    When redirect to login page and add email and password incorrect
    Then the login is not successfull