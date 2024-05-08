@reg
@US01
Feature: Drag and Drop verification.

  Scenario: User should be able to drag and drop items.
    Given user is on the LambdaTest’s Selenium Playground page
    When user clicks Drag & Drop Sliders
    And user selects the slider Default value 15
    And user drags the bar to make the slider value 95
    Then the slider value should be 95


