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

