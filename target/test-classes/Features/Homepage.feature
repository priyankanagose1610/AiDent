Feature: Insert a Condition with Confirm or Cancel

  @tag1
  Scenario: Insert a Condition and Confirm
    Given I am on the page with an image
    When I click on Insert a Condition icon
    And I click on Select a Condition
    And I click on "Confirm" button
    Then I should see a successful message

  @tag2
  Scenario: Insert a Condition and Cancel
    Given I am on the page with an image
    When I click on Insert a Condition icon
    And I click on Select a Condition
    And I click on "Cancel" button
    Then I should return to homepage

  @tag3
  Scenario: Image Movement in Vertical Direction
    Given I am on the page with an image
    When I click on Flip Vertical icon
    Then the image should move vertically

  @tag4
  Scenario: Image Movement in Horizontal Direction
    Given I am on the page with an image
    When I click on  Flip Horizontal icon
    Then the image should move horizontally

  @tag5
  Scenario: Rotate Image by Moving the Pointer
    Given I am on the page with an image
    When I click on the Rotate icon
    And I move the pointer to rotate the image
    Then the image should be rotated based on the pointer's movement
    
    @tag6
    Scenario: Restore orignal position of image.
    Given I am on the page with an image
    When I click on Restore Original image
    Then image restore sucessfully.
    
     @tag7
      Scenario: Check Crop Functionality.
     Given I am on the page with an image
      When I click on Cropicon.
      And I click on custom and Apply it.
      Then image crop Sucessfully.
    
   @tag8
      Scenario: Check Crop Functionality by Cancel.
     Given I am on the page with an image
      When I click on Cropicon.
      And I click on custom and Cancel it.
      #Then image crop Sucessfully.
    
  @tag9
  Scenario: delete image by ClearButton
    Given I am on the page with an image
    When I click on delete icon .
    And I click the confirmclear 
    Then I should see the image deleted message
    
    @tag10
  Scenario: delete image by CancelBtn
   Given I am on the page with an image
    When I click on delete icon .
    And I click the Canceldelete
    Then I should see the image still there message
