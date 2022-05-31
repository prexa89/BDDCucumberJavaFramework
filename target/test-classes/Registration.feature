Feature: Registration feature
  As a customer I want to register
  so I can login

  Scenario: Successful registration with mandatory fields
    Given I am on the home page
    And  I click on register
    When I enter firstname as"preet" and lastname as "shah"
    And  I enter Email as "preet12@yahoo.com"
    And  I enter  password as"123456" and  enter confirm password as "123456"
    And  I click on register button
     #Then : I should be registered

  Scenario: Successful registration with all fields
    Given I am on the home page
    And  I click on register
    When I select gender as female
    And I enter following details to register
      | firstName | lastName | email          | password  | confirmPassword |
      | vedant    | khunt    | test@gmail.com | hello@123 | hello@123       |
   # And  I enter firstname as"preet" and lastname as "shah"
   # And I select date of birth and month of birth and year of birth
    #And I enter Email as "preet12@yahoo.com"
   # And I enter  password as"123456" and  enter confirm password as "123456"
    And I click on register button
    Then I Should see "Your registration completed" text on "registration" page
    And the url should contain with"/registerresult"
@pj
  Scenario: Successful registration with all optional fields
    Given I am on the home page
    And  I click on register
    When I select gender as female
    And I enter following details to register
      | firstName | lastName | email          | password  | confirmPassword |
      | vedant1    | khunt    | test1@gmail.com | hello@123 | hello@123       |
   # And  I enter firstname as"preet" and lastname as "shah"
    And I select date of birth and month of birth and year of birth
    And I enter company name as "Amazon"
    And I select  option for Newspaper
    #And I enter Email as "preet12@yahoo.com"
   # And I enter  password as"123456" and  enter confirm password as "123456"
    And I click on register button
    Then I Should see "Your registration completed" text on "registration" page
    And the url should contain with"/registerresult"
   # And I click on logoutbutton

  Scenario: Successful registration
    Given  I am on the home page
    And  I click on register
    When I select gender as male
    And I enter following details to register
      | firstName | lastName | email          | password  | confirmPassword |
      | parth    | khatri    | test1@gmail.com | 123456 | 123456      |
   # And  I enter firstname as"preet" and lastname as "shah"
    And I select date of birth and month of birth and year of birth
    And I enter company name as "Amazon"
    And I  do not select  option for Newspaper
    And I click on register button
    Then I Should see "Your registration completed" text on "registration" page
    And the url should contain with"/registerresult"

