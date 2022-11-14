@smoke
Feature: F10_Wishlist | users could choose the product he want


  Scenario: user could click on the product he want

    When user clicked on the item "HTC One M8 Android L 5.0 Lollipop"

    Then green message should appear
  Scenario: user could add  the product he want on wishlist

    When user clicked on the item "HTC One M8 Android L 5.0 Lollipop"

    Then product should added to wishlist with the valid quantaty
