Feature: Login with Valid credentials


Scenario: Successfull Login with valid credentials
Given User Launch browser
And opens URL "https://localhost/opencart/upload/"
When User navigate to MyAccount menu
And Clisk on Login
And User enters Email as 'pavanoltraining@gmail.com" and Password as "test@123"
And User navigates to MyAccount Page