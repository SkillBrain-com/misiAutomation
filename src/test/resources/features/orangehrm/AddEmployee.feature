Feature: Add employee
  Scenario Outline: Check Add employee page
    Given Navigate to OrangeHRM
    And   Press expand menu button
    And   Press PIM button
    When  Press Add employee button
    Then  Insert first name <firstName>
    Then  Insert middle name <middleName>
    Then  Insert last name <lastName>
    Then  Insert employee ID <employeeId>
    Then  Press Save button
    Examples:
      | firstName | middleName | lastName | employeeId |
      | Ana | - | Dragulschi | 0123 |