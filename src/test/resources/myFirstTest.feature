Feature: Login

  #tags
  @Regression @SmokeTest @SanityTEst @Prioridada1
  Scenario: Como usuario administrador
            Quiero utilizar usuario y password
            para poder ingresar a la aplicacion

    Given un usuario administrador
    When yo escribo mi usuario en el textbox user
    And yo escribo mi password en el textbox pwd
    And yo escribo mi email en el textbox email
    Then yo deberia poder ingresar a la aplicacion

