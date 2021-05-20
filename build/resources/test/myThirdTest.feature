Feature: Login

  Background:
    Given un usuario administrador
    When yo escribo mi usuario en el textbox user
    And yo escribo mi password en el textbox pwd

  Scenario: verificar informacion
    Then yo deberia poder ingresar a la aplicacion
    And  yo configuro el numero de error en 1254

  Scenario: verificar informacion
    Then yo deberia poder ingresar a "facebook"
    And  yo configuro el numero de error en 9

  Scenario: verificar informacion
    Then yo configuro el numero de error en 1254
    And yo deberia poder ingresar a "facebook"

