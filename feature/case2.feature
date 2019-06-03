Feature: Login to TestMeApp with registered username and password

Scenario Outline: Login 

Given user launching TestMeApp
When user enters username as "<username>" And enter password as "<password>" 
Then clicks ok
And verify login result

Examples: 
|username|password|
|AlexUser|Alex@123|
