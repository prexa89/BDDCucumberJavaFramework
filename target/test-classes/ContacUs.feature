Feature:

  Scenario: Contact us page functionality
    Given I am on the home page
    And  I scroll down to footer
    When I click on contact us link
    And  I should be on the "Contact Us" page
    And  I enter fullname as "preet" and  fullemail as "admin12@yahoo.com"
    And  I enter my message in enquiry box
    And  I click on submit
    Then I should see the confirmation message
