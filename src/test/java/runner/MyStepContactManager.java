package runner;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MyStepContactManager {
    @Given("yo tengo abierto el contact manager")
    public void yoTengoAbiertoElContactManager() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","GalaxyNote9");
        capabilities.setCapability("platformVersion","10");
        capabilities.setCapability("appPackage","com.example.android.contactmanager");
        capabilities.setCapability("appActivity",".ContactManager");
        capabilities.setCapability("platformName","Android");

        Runner.driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

        // implicit wait
        Runner.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @When("yo realizo click en el boton OK si existe el dialog de acualizacion")
    public void yoRealizoClickEnElBotonOKSiExisteElDialogDeAcualizacion() {
        if (Runner.driver.findElements(By.id("android:id/button1")).size()>0)
            Runner.driver.findElement(By.id("android:id/button1")).click();
    }

    @And("yo realizo click en el boton AddContact")
    public void yoRealizoClickEnElBotonAddContact() {
        Runner.driver.findElement(By.id("com.example.android.contactmanager:id/addContactButton")).click();

    }

    @And("yo escribo en el campo nombre el valor de {string}")
    public void yoEscriboEnElCampoNombreElValorDe(String nombreContact) {
        Runner.driver.findElement(By.id("com.example.android.contactmanager:id/contactNameEditText")).sendKeys(nombreContact);

    }

    @And("yo escribo en el campo phone el valor de {string}")
    public void yoEscriboEnElCampoPhoneElValorDe(String fonoContact) {
        Runner.driver.findElement(By.id("com.example.android.contactmanager:id/contactPhoneEditText")).sendKeys(fonoContact);

    }

    @And("yo escribo en el campo email el valor de {string}")
    public void yoEscriboEnElCampoEmailElValorDe(String emailContact) {
        Runner.driver.findElement(By.id("com.example.android.contactmanager:id/contactEmailEditText")).sendKeys(emailContact);

    }

    @And("yo realizo click en el boton Save")
    public void yoRealizoClickEnElBotonSave() {
        Runner.driver.findElement(By.id("com.example.android.contactmanager:id/contactSaveButton")).click();

    }

    @Then("el contacto {string} deberia ser mostrado en la lista de contactos")
    public void elContactoDeberiaSerMostradoEnLaListaDeContactos(String nombreContact) throws InterruptedException {
        Thread.sleep(2000);

        WebDriverWait explicitWait= new WebDriverWait(Runner.driver,15);
        explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='"+nombreContact+"']")));

        Assert.assertTrue("ERROR! contacto no creado",Runner.driver.findElement(By.xpath("//android.widget.TextView[@text='"+nombreContact+"']")).isDisplayed());

    }
}
