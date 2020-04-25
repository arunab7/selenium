Feature: User Login
  @Login
  Scenario: User should able to Login Successfully
    Given User enters the Landing page
    When User enters Username as "indramails@gmail.com" and password"Sahithi0416"
    Then User should see success message
    And Logout from the system
    @Login
 Scenario Outline: User should not be Login
   Given User enters the Landing page
   When User enters Username as "<username>" and password"<password>"
   Then user should not loggedin
   Examples:
   |    username    |    password    |
   | demo@123    |12345 |