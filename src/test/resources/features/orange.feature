#Author: your.email@your.domain.com
#Sample Feature Definition Template




Feature: Orange Tests
  I want to use various orange tests

  @orange1
  Scenario: Search Admin User
    Given user on orange "https://opensource-demo.orangehrmlive.com/" app login page 
    When user enter orange given credentials
           |Admin	 | admin123 |
    Then Navigates to orange dashboard page
    Then Click on some tab1
    Then i enable wifi
    When click to "admin" tab
    When search employee admin user data
  
  
  Scenario: Create New User
    Given user on orange "https://opensource-demo.orangehrmlive.com/" app login page 
    When user enter orange given credentials
           |Admin	 | admin123 |
    Then Navigates to orange dashboard page
    When click to "admin" tab
    Then user management is selected 
    When user clicks on add button
    When add employee admin user data  
    Then user name should exist in user table
    
 @wip
  Scenario: Create New admin User
    Given user on orange "https://opensource-demo.orangehrmlive.com/" app login page 
    When user enter orange given credentials
           |Admin	 | admin123 |
    Then Navigates to orange dashboard page
    When click to "admin" tab
    Then user management is selected 
    When user clicks on add button
    And user select user role type
    And user select user status type
    And user enter char in auto complete field
    And user enter new employee name
    And user enter password
    And user enters confirm password
    And user clicks on save button
    Then user name should exist in user table
    Then logout from app
    
  @regex
  Scenario: cucumber reegex example
    Given I am on "https://www.google.com/"
    When I see grey text
    When I see gray text
    When There is "something" in double quotes
    When handle or situation A in step def
    When handle or situation B in step def
    When handle or situation C in step def
    When handle or situation E in step def
    
    
    
    
    