Feature: May Info
  Scenario Outline: Complete Contact Details
    Given Navigate to OrangeHRM
    When  Fill in <username>
    Then  Add <password>
    Then  Press Login button
    Then Press My Info
    When Contact Details
    Then Street numberOne <streetOne>
    Then Street numberTwo <streetTwo>
    Then Press Save button
    Examples:
      | username | password | streetOne | streetTwo |
      | Admin    | admin123 | Bucuresti | Baneasa   |