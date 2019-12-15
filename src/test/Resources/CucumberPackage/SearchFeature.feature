Feature:
Scenario Outline: Basic search from a user which dont have results

Given he go to  search page
When search with keyword "<Keyword>"
Then he should successfully see the product

Examples:
| Keyword |
| Pride and Prejudice |
