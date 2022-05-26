@Register
  Feature: Registration feature
    As a customer I want to register
   so I can login

  Scenario: Successful registration
    Given I am on the home page
    And  I click on register
    When I enter firstname as"preet" and lastname as "shah"
    And  I enter Email as "preet12@yahoo.com"
    And  I enter  password as"123456" and  enter confirm password as "123456"
    And  I click on register button
     #Then : I should be registered

