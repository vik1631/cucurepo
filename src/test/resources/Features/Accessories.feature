#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template

Feature: Accessories feedback form
	I want to test accessories feedback form and submit it sucessfully


Scenario:Fillin the form and submit
Given I am at the accessories page
	And I scrolled down to acessories section
When I enter values in the fields
|First Name|Email Address|Whats your idea|
|Vignesh|vikiorton@gmail.com|Test|
	And I checked the checkbox
	And I clicked on the send button
Then I should see Thank you message
	

