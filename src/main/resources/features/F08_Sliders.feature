@smoke
Feature: F08_Slider | users could choose the preferred slider

  Scenario: user choose the first slider

    When user slide with "1"
    Then user click on slider "Nokia"
  Scenario: user choose the second slider
    When user slide with "2"
    Then user click on slider "Iphone"
