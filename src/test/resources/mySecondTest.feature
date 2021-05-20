Feature: Login

  Scenario Outline: Como usuario administrador
  Quiero utilizar usuario y password
  para poder ingresar a la aplicacion

    Given un usuario administrador
    When yo escribo mi <user> en el textbox user
    And yo escribo mi <password> en el textbox pwd
    And yo escribo mi <correo> en el textbox email
    Then yo deberia poder ingresar a "<aplicacion>"

    Examples:
      | user | password | correo   | aplicacion |
      | jb1  | 123      | jb@co.pe | facebook   |
      | jb1  | 456      | jb@co.pe | whatsapp   |
      | jb1  | 345P     | jb@co.pe | twiter     |


