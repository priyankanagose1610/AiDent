Feature: Buy and Update Package

  @tag1
  Scenario Outline: User will Buy Monthly Package
    Given User is on the profileDetail page
    When user clicks on Buy Package
    And Clicks on Monthly Subscribe
    #And Clicks on card details
    #And Enters "<card_no>" and "<expirey>" and "<cvv>"
    #And Clicks on pay_now
    #And Clicks on Pay without saving card
    #And Enters "<OTP>" and clicks on Submit
    Then Payment is Successful

    Examples: 
      | card_no             | expirey_date | cvv_no | OTP_pin  |
      | "41111111111111111" | "1223"       | "123"  | "456789" |

  @tag2
  Scenario Outline: User will Buy Monthly Package By Using Early bird discount.
    Given User is on the profileDetail page
    When user clicks on Buy Package
    And User clicks on earlybird discount1
    And Clicks on Monthly Subscribe
    Then Payment is Successful

  @tag3
  Scenario Outline: User will Buy Half Yearly Package
    Given User is on the profileDetail page
    When user clicks on Buy Package
    And Clicks on Half Yearly Subscribe
    Then Payment is Successful

  @tag4
  Scenario Outline: User will Buy Half Yearly Package By Using Early bird discount.
    Given User is on the profileDetail page
    When user clicks on Buy Package
    And User clicks on earlybird discount2 
    And Clicks on Half Yearly Subscribe
    Then Payment is Successful

  #@tag5
  #Scenario Outline: User will Buy Yearly Package
    #Given User is on the profileDetail page
    #When user clicks on Buy Package
    #And Clicks on Yearly Subscribe
    #Then Payment is Successful

  @tag6
  Scenario Outline: User will Buy Yearly Package By Using Early bird discount.
    Given User is on the profileDetail page
    When user clicks on Buy Package
    And User clicks on earlybird discount3
    And Clicks on  Yearly Subscribe
    Then Payment is Successful

   



    