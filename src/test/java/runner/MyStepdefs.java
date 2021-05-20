package runner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * {}  ==> Cualquier valor
 * {String}  ==> Cualquier valor
 * {int}  ==> Cualquier valor
 */


public class MyStepdefs {
    @Given("un usuario administrador")
    public void unUsuarioAdministrador() {
        System.out.println("como usuario admin");
    }

    @When("yo escribo mi {} en el textbox {}")
    public void yoEscriboMiUsuarioEnElTextboxUser(String valor1, String valor2) {
        System.out.println("ingreso " + valor1 );
        System.out.println("ingreso " + valor2 );
    }


    @Then("yo deberia poder ingresar a la aplicacion")
    public void yoDeberiaPoderIngresarALaAplicacion() {
        System.out.println("ver resultado");
    }

    @Then("yo deberia poder ingresar a {string}")
    public void yoDeberiaPoderIngresarA(String app) {

        System.out.println("ingrese a la app: " + app);
    }

    @Then("yo configuro el numero de error en {int}")
    public void yoConfiguroElNumeroDeErrorEn(int numero) {

        System.out.println("ingrese el numero : " + numero);

    }
}
