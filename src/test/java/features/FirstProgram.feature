Feature: Application login

  Scenario: Admin Page default login
    Given User is on netBanking landing page
    When User login into application with username "admin" and password "pass1"
    Then Home Page is displayed
    And Cards are displayed

  #Reusable

  Scenario: User Page default login
    Given User is on netBanking landing page
    When User login into application with username "customer1" and password "pass2"
    Then Home Page is displayed
    And Cards are displayed

  Scenario Outline: Multiple Users Page default login
    Given User is on netBanking landing page
    When User login into application with username "<Username>" and password "<Password>"
    Then Home Page is displayed
    And Cards are displayed
    Examples:
      | Username | Password |
      | johnson  | passw2   |
      | rebecca  | passw3   |
      | edward   | passw4   |

