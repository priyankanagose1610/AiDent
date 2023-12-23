Feature: Print And Download Functionality


  @tag1
  Scenario Outline: 
    user should be able to download xray
    Given user on login page
    When user click on download
    Then x-ray will download
    When user click on Print
    Then we will get print of x-ray