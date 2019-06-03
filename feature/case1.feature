
Feature: Register to TestMeApp

Description: User Registers into TestMeApp using valid details like FirstName,LastName,Email,password
Confirm password,mobile number,DOB ,Address and security question

  Scenario: Registration
    Given user launch chrome browser And enters an TestMeApp url
    When user clicks SignUp
    When user enters  User Name as "AkshayaSampath"
    When user enters  First  Name as "AkshayaSampath"
    When user enters Last Name as "S"
    When user enters password as "qwerty"
    When user enters confirm password as "qwerty"
    When user selects Gender as  "Female"
    When user enters a E-Mail as "abc@gmail.com"
    When user enters a mobile number as "1234567890"
    When user enters a DOB as "12/22/1996"
    When user enters a Address as "12 Nehru street"
    When user selects a security question as "What is your Birth Place?"
    When user enters a Answer as "Erode"
    Then the user clicks Register
    
    
       