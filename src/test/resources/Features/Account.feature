
  @tag1
  Scenario Outline: Account Details with Proper Data
    Given User on AiDent Page
    When User click on Account
    Then User should navigate to Profile Page
   
   @tag2
   When User click on Change Package.
   Then Subscribe Page will open.
   When Click on Subscribe button
   Then Pay Now Page will open.
   
   @tag3
   When User click on cards.
   Then Card Page will open.
   When Add details of Card
   Then click on pay now 
   When user click on RazorPay
   