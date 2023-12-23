
  Feature: Image Upload and Submission
  @tag1
  Scenario: Upload an Rvg image and submit
    Given I am on the upload page
    When I select an Rvg image to upload
    And I click the submit button
    Then I should see a success message
    @tag2
    Scenario: Upload an Rvg image and submit
    Given I am on the upload page
    When I select an Opg image to upload
    And I click the submit button
    Then I should see a success message
    
     @tag3
    Scenario: Upload an normal image and submit
    Given I am on the upload page
    When I select an normal image to upload
    And I click the submit button
    Then I will get Imgerror Message
    
    @tag4
  Scenario: Upload an image, click delete, and confirm deletion
    Given I am on the upload page
    When I select an Rvg image to upload
    And I click the delete button
    And I confirm the deletion
    Then I should see the image deleted message

   @tag5
  Scenario: Upload an image, click delete, and cancel deletion
    Given I am on the upload page
    When I select an Rvg image to upload
    And I click the delete button
    And I cancel the deletion
    Then I should see the image still there message
      
   #@tag6
    #Scenario: Upload an Rvg image and submit
    #Given I am on the upload page
    #When I select an Rvg image to upload
    #And I click the submit button
    #Then I should see a Alert message