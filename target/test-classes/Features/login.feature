Feature: Login Functionality of AI Dent

  @tag1
  Scenario Outline: 
    user should be login with valid data

    Given user on login page
    When user provide <username> and <password>
    And click on button
    Then sucessfully login on Home Page

    Examples: 
      | username                          | password       |
      | "priyanka@varahitechnologies.com" | "Priya@123"    |
      | "atul@varahitechnologies.com"     | "Atul@123"     |
     #| "rakesh123@yopmail.com "          | "Priya@123"    |

  #@tag2
  #Scenario Outline: 
    # Newuser should be login with valid data & terms and condition
#
    #Given user on login page
    #When user provide <username> and <password>
    #And click on button
    #And click on termsConditions
    #And click on AgreeButton
    #Then sucessfully login on Home Page

    Examples: 
      | username                          | password       |
      #   | "rakesh123@yopmail.com "          | "Priya@123" |
     # | "priyanka@varahitechnologies.com" | "Priya@123" |

     #| "atul@varahitechnologies.com"     | "Atul@123"  |
  @tag3
  Scenario Outline: 
    user should be login with valid mailid and invalid password

    Given user on login page
    When user provide <username> and <password>
    And click on button
    Then get error

    Examples: 
      | username                          | password     |
      | "priyanka@varahitechnologies.com" | "Priya@123np"  |
      | "atul@varahitechnologies.com"     | "Atul@12345" |

  @tag4
  Scenario Outline: 
    user should be login with invalid mailid and valid password

    Given user on login page
    When user provide <username> and <password>
    And click on button
    Then get error

    Examples: 
      | username                          | password     |
      | "priyanka@456varahitechnologies.com" | "Priya@123"  |
      | "atul@456varahitechnologies.com"     | "Atul@123" |

  @tag5
  Scenario Outline: 
    user should be login with invalid mailid and invalid password

    Given user on login page
    When user provide <username> and <password>
    And click on button
    Then get error

    Examples: 
      | username                             | password      |
      | "priyanka123@varahitechnologies.com" | "Priyanp@12345" |
      | "atul123@varahitechnologies.com"     | "Atulnp@12345"  |

  @tag6
  Scenario Outline: 
    verification of eyes icon

    Given user on login page
    When user provide <username> and <password>
    Then click on eyes icon
    Then password is displayed

    Examples: 
      | username                             | password      |
      | "priyanka@varahitechnologies.com" | "Priyanka@123" |
