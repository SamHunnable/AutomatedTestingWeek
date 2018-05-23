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

Feature: Working with a Stack
  As a person
  I want to store things in a stack
  So that I can demonstrate it works

Scenario: Push an item into a stack
  Given an empty stack
  When I push an item into the stack
  Then the stack contains one item

Scenario: Push two items into a stack
  Given an empty stack
  When I push an item into the stack
  And I push another item into the stack
  Then the stack contains two items

Scenario: Pop a given item from the stack
  Given an empty stack
  When I push an item into the stack
  And I pop from the stack
  Then I get the same item back

