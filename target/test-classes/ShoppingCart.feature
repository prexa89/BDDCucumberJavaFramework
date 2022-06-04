@AddToCart
Feature: Category feature
  As a customer I Want to buy
  a product.

  Scenario: Successful selection and addition of product to the cart
    Given I am on the home page
    When  I select category of computer
    And  I select subcategory of desktops
    And  I select the Lenovo PC
    And  I add this product into the cart
    Then I should see the product in the shopping cart

  Scenario: Successful checkout
    #Given I am on computer category page
   # And   I click on shopping cart
   # When  I click on terms and condition
   # And   I click on checkout button
   # And  I enter Email as "<string>" and password as "<string>" to login
  #  And  I Click on the Login button
    #And I am on shopping cart page and click

  Scenario: Successful checkout
    Given I am on the home page
    And I Click on the Log in
    And  I enter Email as "preet12@yahoo.com" and password as "123456"
    And I Click on the Login button
    And I select category of computer
    And I select subcategory of desktops
    And I select the Lenovo PC
    And I add this product into the cart
    And I close add to cart message
    When I click on shopping cart Button
    And I click on terms and condition
    And I click on checkout button




