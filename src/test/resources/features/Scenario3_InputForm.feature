@reg
@US01
Feature: Input form submit verification.

  Scenario: User should be able to input values in the form and submit it.
    Given user is on the LambdaTest’s Selenium Playground page
    When user clicks Input Form Submit
    And user clicks Submit button
    Then user should see the error message: "Please fill out this field."
    When user fills all the fields
      | Name      | Baha            |
      | Email     | bkucu@gmail.com |
      | Password  | 123456          |
      | Company   | CNR             |
      | Website   | www.cnr.com     |
      | Country   | United States   |
      | City      | Atlanta         |
      | Address 1 | 45 Lincoln St   |
      | Address 2 | 3267            |
      | State     | Georgia         |
      | Zip Code  | 30040           |
    And user clicks Submit
    Then user should see the message: "Thanks for contacting us, we will get back to you shortly."






