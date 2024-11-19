Feature: May Info
  Scenario Outline: Complete Contact Details
    Given Navigate to OrangeHRM
    When  Fill in <username>
    Then  Add <password>
    Then  Press Login button
    Then Press My Info
    Then Contact Details
    Then create street number one <streetOne>
    Then create street number two <streetTwo>


    Examples:
      | username | password | streetOne | streetTwo |
      | Admin    | admin123 | Bucuresti | Baneasa   |