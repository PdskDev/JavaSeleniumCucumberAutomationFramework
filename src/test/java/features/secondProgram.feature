Feature: Application login

  Background:
    When launch the browser from config variable
    And hit the home page url of banking site

  @NetBanking
  Scenario: User Page default login
    Given User is on netBanking landing page
    When User login into application with username "customer1" and password "123456"
    Then Home Page is displayed
    And Cards are displayed

  @MultipleUsers @SmokeTest
  Scenario Outline: Multiple Users Page default login
    Given User is on netBanking landing page
    When User login into application with username <Username> and password <Password>
    Then Home Page is displayed
    And Cards are displayed
    Examples:
      | Username | Password |
      | johnson  | passw2   |
      | rebecca  | passw3   |
      | edward   | passw4   |