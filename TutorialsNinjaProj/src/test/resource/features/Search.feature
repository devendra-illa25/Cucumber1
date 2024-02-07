 @all
Feature: Search functionality

# The below statement demonstrates the use of Background Gherkin keyword

Background:
Given User opens the application

@search @validproduct @smoke @regression
Scenario: Search for a valid product

When User enters valid product into search field
And User clicks on search button
Then Valid product should get displayed in search results
#But invalid product should not be displayed in search results

@search @nonexistingproduct @regression
Scenario: Search for non-existing product

When User enters non-existing product into search field
And User clicks on search button
Then proper text informing the user about no product matching should be displayed

@search @noproduct @regression
Scenario: Search for with out providing any product

When User dont enters any product into search field
And User clicks on search button
Then proper text informing the user about no product matching should be displayed
