@smoke
Feature: F07hoverselection| user able to hover the header menu
  Scenario: User able to select sub category from hover

    When   user hover the categories
    Then   compare page line with the sub category text
