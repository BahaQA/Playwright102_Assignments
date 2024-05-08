@reg
@US01
Feature: Simple form verification.

  Scenario: User should be able to fill the form and send a message
    Given user is on the LambdaTest’s Selenium Playground page
    When user clicks Simple Form Demo
    Then the url should contain "simple-form-demo"
    When user enters "Welcome to LambdaTest" in the Enter Message text box
    And user clicks Get Checked Value
    Then "Welcome to LambdaTest" should be displayed in the right-hand panel under the Your Message section
















