Feature: Add employee
  Scenario Outline: Check Add employee page
    Given Navigate to OrangeHRM
    And   Press PIM button
    When  Press Add employee button
    Then  Insert <firstName>
    Then  Insert <middleName>
    Then  Insert <lastName>
    Then  Insert <employeeId>
    Then  Press Save button
    Examples:
      | firstName | middleName | lastName | employeeId |
      | Ana | - | Dragulschi | 0123 |
