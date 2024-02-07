@all
Feature: User Login
Registered User should be able toclogin to access account details

Background:
Given User navigates to Login page

@login @validcredentials  @regression @dev
Scenario Outline: Login with valide credentails

When User enters valid email address <email>
And Enters Valid password <password>
And Clicks on login button
Then User should login successfully
Examples:
|email|													|password|
|devendrapradeep1825@gmail.com| |123456| 
|devendrapradeep182@gmail.com|  |123456| 
|devendrapradeep15@gmail.com|   |123456| 


@login @invalidcredentials  @smoke @regression
Scenario: Login with invalid credentails

When User enters invalid email address "@gmail.com"
And Enters inValid password "12345    @"
And Clicks on login button
Then User should get a proper warning message

@login @validemailandinvalidpassword @regression @wip
Scenario: Login with valid email address and invalid password

When User enters valid email address "devendrapradeep1825@gmail.com"
And Enters inValid password "12345    @"
And Clicks on login button
Then User should get a proper warning message

@login @invalidemailandvalidpassword @regression
Scenario: Login with invalid email address and valid password

When User enters invalid email address "@gmail.com"
And Enters inValid password "12345"
And Clicks on login button
Then User should get a proper warning message

@login @nocredentials @regresion @ignore
Scenario: Login with out providing any credentials

When User dont enter any credentails
And Clicks on login button
Then User should get a proper warning message
