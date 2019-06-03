
Feature: User purchased a product in TestMeApp


  @tag1
  Scenario: SignIn
    Given User launching TestMeApp
    When user enters username 
    When user enters password
    Then user clicks Login

  @tag2
  Scenario: Search product 
    When user clicks the search field and enters the product name 
    Then user clicks FIND DETAILS
    
  
