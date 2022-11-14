@smoke
Feature: F05_Search | user will search items
  Scenario Outline: Login functionality for a social networking site.
    Given test this value "<ProductName>"
    Then  showReleventItems "<ProductName>"
    Examples:
      |ProductName|
      |     book      |
      |    laptop     |
      |     nike      |
  Scenario Outline: Searching for products
    Given test this value "<sku>"
    Then SelectReleventdata"<sku>"
    Examples:
      |sku|
      | SCI_FAITH  |
      |  APPLE_CAM |
      |  SF_PRO_11 |