@Login
Feature: Login feature
  As a customer
  I Want to log in
  So that I can see my e-mails

@Endtoend
  Scenario: Validate Log In Page
    Given I am on the home page
    When I Click on the Log in
    Then I Should see "Welcome, Please Sign In!" text on "login" page
    And the url should contain with"/login"

  Scenario:Successful login
    Given I am on the home page
    And  I Click on the Log in
    Given I enter Email as "61preet12@yahoo.com" and password as "123456"
    When I Click on the Login button
    Then  I should see logout button displayed
    And  I click on logoutbutton


  Scenario Outline: login With more than one email id and password
    Given I am on the home page
    And  I Click on the Log in
    Given I enter Email as "<Email>" and password as "<Password>"
    When I Click on the Login button
    Then  I should see logout button displayed
    And  I click on logoutbutton
    Examples:
      | Email            | Password |
      | admin@yahoo.com  | 123456   |
      | admin1@yahoo.com | 123456   |
      | admin2@yahoo.com | 456789   |
      | admin3@yahoo.com | 123456   |


  Scenario: unsuccessful login
    Given I am on the login page
    And  I Click on the Log in
    Given I enter  Email as "admin12@yahoo.com"
    When I click on the login button
    #Then I should not be logged in

  Scenario: Forgot password link functionality
    Given I am on the home page
    And  I Click on the Log in
    And I enter Email as "76preet12@yahoo.com"
    When I click on forgot password
    Then  I should be on password recovery page
    And  I enter  Email as "76preet12@yahoo.com"
    And I click on recover button
    And I should see the email sent message






