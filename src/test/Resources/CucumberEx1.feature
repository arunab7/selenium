Feature: User Accounts
  Scenario: User should able to land homepage
    Given  User opened the browser
    When he go to homepage
    Then close the browser

    Scenario: User should able to login successfully
      Given User is in LoginPage
      When he enters username
      And he enters password
      And try to login
      Then he should close the browser

      Scenario: User should successfully book flight
        Given User is in BrowserPage
        When he enters UserName and Password
        And he try to login
        Then set the departing place to "Paris"
        And set the Returning date to "December"
        Then he  close the browser

  Scenario Outline: User should not be login with invalid credentials

    Given user is in login page
    When us enters user name as "<Username>" and password as "<Password>"
    And user try to login
    Then he should be not be login

    Examples:
    |   Username        |   Password    |
    |   demo2@demo.com  |   1212         |
    |   demo2           | 1234567        |

