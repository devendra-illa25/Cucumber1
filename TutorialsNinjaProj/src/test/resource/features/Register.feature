@all
Feature: User registeration

Background: 
Given User navigate to register Account page

@register @mandatoryfield @smoke @regression
Scenario: Register with manditory fields

When User enters below details into the fields
|firstname	|Arun|
|lastname		|Motoori|
|email			|arun.motorri@gmail.com|
|telephone	|1234567890|
|password		|12345|

And select privacy policy field
And clicks on continue button
Then Account should get successfully created

@register @allfields @smoke @regression
Scenario: Register with all fields

When User enters below details into the fields
|firstname	|Arun|
|lastname		|Motoori|
|email			|arun.motorri@gmail.com|
|telephone	|1234567890|
|password		|12345|

And selects yes for news letter
And select privacy policy field
And clicks on continue button
Then Account should get successfully created

@register @nodetails @regression
Scenario: Register without providing any fields

When User dont enter details into any fields
And clicks on continue button
Then Warning messages should be displayed for manditoty fields

@register @duplicateemail @regression
Scenario: Register with duplicate email address

When User enters below details into the fields
|firstname	|Arun|
|lastname		|Motoori|
|email			|amotorricap9@gmail.com|
|telephone	|1234567890|
|password		|12345|

And selects yes for news letter
And select privacy policy field
And clicks on continue button
Then Warning message informating the user about duplicate email should be displayed




                     