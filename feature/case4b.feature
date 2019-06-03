Feature: purchasing without adding in cart

Scenario: Without cart
Given user launches testmeapp
When user enters user name
When user enters pass word
When user clicks on Login
When user search for a product
Then clicks find details
Then user tries to purchase a product without adding into cart




