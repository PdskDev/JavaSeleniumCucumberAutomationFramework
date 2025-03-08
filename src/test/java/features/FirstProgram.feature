Feature: Application login

  @GettingStarted @RegressionTest
  Scenario: Admin Page default login
    Given User is on netBanking landing page
    When User login into application with username "admin" and password "pass1"
    Then Home Page is displayed
    And Cards are displayed

  #Reusable
  @RegressionTest
  Scenario: User Page default login
    Given User is on netBanking landing page
    When User login into application with username "customer1" and password "123456"
    Then Home Page is displayed
    And Cards are displayed

  @MultipleUsers
  @SmokeTest
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

  @SmokeTest
  Scenario: Practice Page default Sign Up
    Given User is on Practice landing page
    When User signup into application
      | robert           |
      | edward           |
      | robert@edward.me |
      | 0102030405       |
    Then Home Page is displayed
    And Cards are displayed