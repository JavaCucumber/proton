#Author: your.email@your.domain.com


Feature: Sample login tests
  I want to tests the login functionality of proton app

   
  @invalid
  Scenario: login password error
    Given User on login page
    When User enter "herris@protonmail.com" mail
    And enter wrong "Test@123" password 
    When click on submit button
    Then password error message appaers 
  
  @wrong
  Scenario: allure test
    Given User on login page
    When User enter wrong mail id
  
  @protonlogin
  Scenario: check login and logout
   
    Given User on login page
    When User enter mail id
    And User enter password
    Then user navigates to mail box
    When clicks on user profile 
    Then logout button displayed
    When click on logout button
    Then sucessfully logout from app
 
  @compose_mail
  Scenario: table example
    Given User on login page
    When user enter given credentials
           |Harry_ji@protonmail.com | Test@1234 |
    When click on submit button
    Then user navigates to mail box
    When compose new mail to "harryjames1010@protonmail.com" and subject "Test_" the mail body
         """
         Hi,
         
         Greeting from joe
         
         """
    When user wait for 5 secs
    When user click on send button
    When user wait for 5 secs
    And print the mail subject
  
  
  #
  @hover
  Scenario: check hover and regex
    Given user on "https://abstracta.us/blog/" test site
    When hover mouse '' Testing
    
    
    
    
    