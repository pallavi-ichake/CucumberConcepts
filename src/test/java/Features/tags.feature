
Feature: Samapel Facebook featuer

Background: Commman steps
    Given user login to facebook

@pallavi
  Scenario: Login to facebook
    When Enter username
    Then Enter password
    And say hi
 
 @sanity   
    Scenario: Login to facebook
    When Enter Sanity email
    Then Enter sanity password
 
@smoke 
    Scenario: Login to facebook
    When Enter smoke username
    Then Enter smoke password
 
 @regression  
    Scenario: Login to facebook
    When Enter regression username
    Then Enter regression password
    
   



 