
Feature: Calculadora

  @Calculadora
  Scenario: Como usuario quiero realizar la suma
    de dos numeros y obtener el resultado.

    Given yo tengo abierto mi calculadora en el celular
    When yo hago click en el boton 7
    And yo hago click en el boton sumar
    And  yo hago click en el boton 1
    And yo hago click en el boton igual
    Then el resultado deberia ser 8