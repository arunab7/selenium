Feature: Registration page
  Scenario Outline: user should successfully register
    Given user was in Registration page
    When he selects Gender as "<MaleOrFemale>"
    And he enters FirstName as "<FirstName>"
    And he enters LastName as "<LastName>"
    And selects DateOfBirth as "<DateBirth>"
  And  selects Month as"<MonthBirth>"
  And  selects Year as"<Year>"
    And enters email as "<EmailID>"
    When he enters Company name as" <Company name>"
    And he enters Password as "<PasswordChar>"
    And he enters Confirm Password as "<Confirm Password>"
    And Try to submit
    Then he should closing the browser
    Examples:
      | MaleOrFemale | FirstName   |LastName | DateBirth   | MonthBirth    | Year  | EmailID                | Company name    |PasswordChar     |Confirm Password|
      | F            | Aruna       |Panditi  |7            |November       |1984         |arunab7@gmail.com       | neeltechnologies| Sahithi0416     |Sahithi0416     |
