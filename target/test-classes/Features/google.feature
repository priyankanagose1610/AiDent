Feature:  Login with Google

  @tag1
   Scenario: Log in with a Google account
    Given I am on the Google login page
    When I click the Sign in with Google  
    And I enter my email  <username> 
    And I click the Next button
    And I enter my password <password>
    And I click the Password Next button
    Then I should be logged in
     Examples: 
      | username                          | password       |
      | "priyanka@varahitechnologies.com" | "Priya@123" |
      #| "atul@varahitechnologies.com"     | "Atul@123"  |

    @tag2
    Scenario: Log in with a Google account for forget Password.
    Given I am on the Google login page
    When I click the Sign in with Google  
    And I enter my email  <username> 
    And I click the Next button
    And I enter my password <password>
    
    And I click on Forget Password.
    Examples: 
      | username                          | password       |
      | "priyanka@varahitechnologies.com" | "Priya@12345" |
    
      #@tag1
   #Scenario: Log in with a Google account
    #Given I am on the Google login page
    #When I click the Sign in with Google  
    #And I enter my email "priyanka@varahitechnologies.com"
    #And I click the Next button
    #And I enter my password "Priya@123"
    #And I click the Password Next button
    #Then I should be logged in