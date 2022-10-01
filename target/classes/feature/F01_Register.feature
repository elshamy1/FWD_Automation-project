@regression
Feature: user should be able to register to system


  Scenario: user register with valid data
    Given user open register

    When user enter data
    And  user click on register button

    Then user could register


