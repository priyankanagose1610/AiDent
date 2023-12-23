
   Feature: Check Search Functionality
    @tag1
    Scenario: Perform a basic search
    Given User on home page
    When I enter <term> into the search bar
    Then I should see a list related to term
    
     Examples: 
      |    term   |
      | "Root"    | 
      #| "Pulp"    |
      
      @tag2
    Scenario:  search with case sensitive small letter
    Given User on home page
    When I enter <term> into the search bar
    Then I should see a list related to term
    
     Examples: 
      |    term   |
      | "root"    | 
      #| "pulp"    |
      
    @tag3
    Scenario: Search with incorrect word correction
    Given User on home page
    When I enter <term> into the search bar
    Then I will get error message     
    
     Examples: 
      |  term   |
      | "ppl"    |