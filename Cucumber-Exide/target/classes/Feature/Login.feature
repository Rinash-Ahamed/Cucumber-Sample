Feature:  LoginFeature - This feature deals with the login functionality of the application

Scenario: Login with correct username and password

Given user already in Login page
When title of Login page is Heptagon-Portal
Then user enters username and password
Then user click on Login button 
Then checked dashboard title is present