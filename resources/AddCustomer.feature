
Feature: 
  
Background:
      Given The user is in telecom page
        And The user navigates to add customer details
        
        
  Scenario: To customer fill details and click submit
   
    When The user fill in the form
    |fname|lname|email       |address|phno|
    |text|abcde|kr@gmail.com|nilllll|8967|
    |text|bcdef|ar@gmail.com|nil    |6789|
    |text|cbdfr|vr@gmail.com|nil    |1234|
    |text|dhjyr|sr@gmail.com|nil    |7865|
    And The user submits the form
    Then The customer should see the id is generated
    

  Scenario: To customer fill details and click submit btn
   
    When The user fill in the form
    |fname|lname|email       |address|phno|
    |text|abcde|kr@gmail.com|nilllll|8967|
    |text|bcdef|ar@gmail.com|nil    |6789|
    |text|cbdfr|vr@gmail.com|nil    |1234|
    |text|dhjyr|sr@gmail.com|nil    |7865|
    And The user submits the form
    Then The customer should see the id is generated
    
    Scenario: To customer fill details and click submit btn1
    
    When The user fill in the form
    |fname|lname|email       |address|phno|
    |text|abcde|kr@gmail.com|nilllll|8967|
    |text|bcdef|ar@gmail.com|nil    |6789|
    |text|cbdfr|vr@gmail.com|nil    |1234|
    |text|dhjyr|sr@gmail.com|nil    |7865|
    And The user submits the form
    Then The customer should see the id is generated
