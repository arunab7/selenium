Feature: Home page

  Background:
    Given  go to home page

  Scenario Outline: Social media links

    When he open the "<Social media link>" link
    Then the page in new TAB should be open with text "<Expected Text>"

    Examples:
      | Social media link | Expected Text  |
      | Facebook          | Email or Phone |

    Scenario Outline: Footer links
      When he open the Footer link as "<Footer links>"link
      Then the page should display page in text as "<Text>"
      Examples:
        | Footer links | Text     |
        | Search       | Search    |
        | News         |  News     |
        | Blog          |  Blog    |