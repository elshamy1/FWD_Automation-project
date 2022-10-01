@regression

Feature: user should be able to follow us
  Background: user navigate to section
    Given user navigate to follow us icons


  Scenario: user follow us facebook
    When user click on facebook icon
    Then the facebook top open in a new page

  Scenario: user follow us twitter
    When user click on twitter icon
    Then the twitter top open in a new page

  Scenario: user follow us rss
    When user click on rss icon
    Then the rss top open in a new page

  Scenario: user follow us youtube
    When user click on youtube icon
    Then the youtube top open in a new page


