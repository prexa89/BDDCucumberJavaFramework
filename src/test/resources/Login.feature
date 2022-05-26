@Login
  Feature: Login feature
    As a customer
    I Want to log in
    So that I can see my e-mails

  Scenario: Validate Log In Page
    Given I am on the home page
    When I Click on the Log in
    Then I Should see "Welcome, Please Sign In!" text on login page
    And the url should contain with"/login"

    Scenario:Successful login
      Given I am on the home page
      And  I Click on the Log in
      Given I enter Email as "admin12@yahoo.com" and password as "123456"
      When I Click on the Login button
      #And  I should be logged in

    Scenario: unsuccessful login
      Given I am on the login page
      And  I Click on the Log in
      Given I enter  Email as "admin12@yahoo.com"
      When I click on the login button
   # Then I should not be logged in


