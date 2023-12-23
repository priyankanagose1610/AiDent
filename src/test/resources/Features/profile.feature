Feature: Check Profile Actions 

  @tag1
  Scenario Outline: User will check Profile Actions
   
    Given User on home page
    When user click on Profileicon
    Then user will be on profileDetail page
    
    @tag2
  Scenario Outline: User will check Points Actions
   
    Given User on home page
    When user click on Points
    Then user will be on profileDetail page
 
  @tag3
  Scenario Outline: User will check Revenue Actions
   
    Given User on home page
    When user click on Revenue
    Then user will be on profileDetail page
    
   @tag4
   Scenario Outline: User will check Subscribe Actions
   
    Given User on home page
    When user click on Subscribe
    Then user will be on profileDetail page
    
     @tag5
   Scenario Outline: User will check Logout Actions
   
    Given User on home page
    When user click on Logout
    And I click the logout button
    Then User will logout.
   
    @tag6
   Scenario Outline: User will check Logout Actions
   
    Given User on home page
    When I click the cancel button 
    Then User will remain on same page.
   