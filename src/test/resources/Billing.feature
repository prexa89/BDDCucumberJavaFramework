Feature: Billing feature
  As a customer I Want to pay for
  a product.

  Scenario: Payment functionality
   #Given I am on shopping Cart page
    Given I am on the home page
    And I Click on the Log in
    And  I enter Email as "36test1@gmail.com" and password as "123456"
    And I Click on the Login button
    And I select category of computer
    And I select subcategory of desktops
    And I select the Lenovo PC
    And I add this product into the cart
    #And I close add to cart message
    When I click on shopping cart Button
    And  I click on terms and condition
    And I click on checkout button
    And I select Country as "United Kingdom"
    And I enter following details
      | cityName      | address_1     | zipCode   | phoneNumber  |
      | London      | 1504,Greenford road | UB6 0HR| 01234567890|
    Then I click on continue button
   # And I am on checkout page
    And I select shipping option 1
    And I click on continue
