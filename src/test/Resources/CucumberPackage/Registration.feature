Feature: Registration page
  @Login
  Scenario Outline: user should successfully register
    Given user was in Registration page
    When he selects Gender as "<MaleOrFemale>"
    And he enters FirstName , Lastname , emailid, company,password,confirmpassword
    |   fname  |   lastname  |  EmailID       |     Company name   |   PasswordChar    |   Confirm Password  |
    |   Sahithi    | Panditi |Sahithi10@gmail.com  |neeltechnologies|Sahithi0416        |  Sahithi0416    |
    And selects DateOfBirth as "<DateBirth>" "<MonthBirth>""<Year>"
    And Try to submit
    Then he should see successfull message
    And logout from the system
    Examples:
      | MaleOrFemale | DateBirth   | MonthBirth    | Year  |
      | F            |7            |November       |1984    |






