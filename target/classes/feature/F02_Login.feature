@regression
Feature: user should be able to login to system


  Scenario: user login with valid data
    Given user open login

    When user enter valid "email" & "password"
    And  user click on login button

    Then user could login


