@smoke
  Feature: F06ResetPassword| user able to reset password
    Scenario: User could reset password
      Given  User click on Login button
      When   user enter email "FatmaaMo5@example.com"
      Then   Message is displayed
