@smoke
Feature: F09_followUs | user go to the different social links
  Scenario:user go to facebook link
    When  user click on "facebook"
    Then  user go to "https://www.facebook.com/nopCommerce" tab
  Scenario:user go to twitter link
    When  user click on "twitter"
    Then   user go to "https://twitter.com/nopCommerce" tab
    Scenario:user go to rss link

      When  user click on "rss"
      Then  user go to "https://demo.nopcommerce.com/new-online-store-is-open" tab

  Scenario:user go to youtube link

    When user click on "youtube"
    Then user go to "https://www.youtube.com/user/nopCommerce" tab