package runner;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MyStepCalculadora {

    @Given("yo tengo abierto mi calculadora en el celular")
    public void yoTengoAbiertoMiCalculadoraEnElCelular() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","GalaxyNote9");
        capabilities.setCapability("platformVersion","10");
        capabilities.setCapability("appPackage","com.sec.android.app.popupcalculator");
        capabilities.setCapability("appActivity",".Calculator");
        capabilities.setCapability("platformName","Android");

        Runner.driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        Runner.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @When("yo hago click en el boton {int}")
    public void yoHagoClickEnElBoton(int numero) {

        switch (numero) {
            case 7:
                Runner.driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_07")).click();
                break;
            case 1:
                Runner.driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_01")).click();
                break;
        }

    }

    @And("yo hago click en el boton sumar")
    public void yoHagoClickEnElBotonSumar() {

        Runner.driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add")).click();

    }

    @And("yo hago click en el boton igual")
    public void yoHagoClickEnElBotonIgual() {

        Runner.driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal")).click();

    }

    @Then("el resultado deberia ser {int}")
    public void elResultadoDeberiaSer(int resulE) throws InterruptedException {

        String resulA = Runner.driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula")).getText();
        System.out.println("resultado: " + resulA);
        Assert.assertEquals("Error! la suma es incorrecta",String.valueOf(resulE),resulA);

        Thread.sleep(5000);

    }
}
