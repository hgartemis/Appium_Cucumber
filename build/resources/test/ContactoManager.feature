Feature: ContactManager
  Scenario: como usuario
  quiero agregar nuevos contactor
  para organizarlos de mejor manera

    Given yo tengo abierto el contact manager
    When yo realizo click en el boton OK si existe el dialog de acualizacion
    And yo realizo click en el boton AddContact
    And yo escribo en el campo nombre el valor de "AARemove"
    And yo escribo en el campo phone el valor de "78978999"
    And yo escribo en el campo email el valor de "remove@remove.com"
    And yo realizo click en el boton Save
    Then el contacto "AARemove" deberia ser mostrado en la lista de contactos