Feature: ContactManager

  @JB
  Scenario: Crear Contacto

    Given I have access to contactManager
    And I accept the update the app if dialog appers
    When I click on "addContactButton" button main screen
    And I type "AAARemove" in "nameTextBox" TextBox
    And I type "9999999" in "phoneTextBox" TextBox
    And I type "remo@remove.com" in "emailTextBox" TextBox
    And I click on "saveButton" button
    Then the contact "AAARemove" should be displayed