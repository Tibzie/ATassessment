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
Feature: Using OrangeHRM
  As an administrator
  I want to manage the database
  So that the details it holds are up-to-date and relevant
 
Scenario: Add an employee to the CRM

  Given the login page
  When I login
  And I click the PIM tab
  And then the Add Employee Tab
  And I fill out the Employee Details correctly
  And I choose to create Login Details by clicking the appropriate button
  And I fill out the Login Details correctly
  And I click the Save button
  Then I can search for the Employee I have just created    
  And select them for inspection
