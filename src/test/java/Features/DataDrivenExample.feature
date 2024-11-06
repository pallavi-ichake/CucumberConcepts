
  Feature: Data driver with Facebook
  Scenario Outline: Login to google
    Given I enter url "https://www.facebook.com/"
    When I enter email "<email>"
    Then I enter password "<password>"

    Examples: 
      | email        | password | 
      | Abhijeet     | Pallavi  | 
      | Deshmukha    | Ichake   | 
      |Abhi          | pal      |
