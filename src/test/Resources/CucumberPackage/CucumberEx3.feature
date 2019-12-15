Feature: ShoppingBasket

Scenario: User should view items in basket
Given user is in landing page
When add default item to basket
And go to shopping cart
  Then he should see the result
  Then he should close the browserpage
