@ShippingMethod
Feature: Billing feature
  As a customer I Want to pay for
  a product.

  Scenario: Payment functionality
   #Given I am on shopping Cart page
    Given I am on the home page
    And I Click on the Log in
    And  I enter Email as "88preet12@yahoo.com" and password as "123456"
    And I Click on the Login button
    And I select category of computer
    And I select subcategory of desktops
    And I select the Lenovo PC
    And I add this product into the cart
    And I close add to cart message
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
    And I choose 2nd option for shipping method
    And I click on shipping method continue
    And I choose credit card for payment
    And   I click on continue btn
    And I enter cardholder name as "xyz" and cardnumber as"123456789123456789"
    And I enter card expire month as "10" and card expire year as "2023"
    And I enter card code as "123"
    And I click continue for payment info
    And I click on confirm
    And I should get order number
