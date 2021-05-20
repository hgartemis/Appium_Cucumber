package runner;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import singletonSesion.Session;

import java.net.MalformedURLException;

@RunWith(Cucumber.class)
public class Runner {

    public static AppiumDriver driver;

    // HOOKS
    @Before
    public void beforeHoookCucumber(){

        System.out.println("*** before");
    }

    @After
    public void afterHoookCucumber(Scenario scenario) throws MalformedURLException {
        System.out.println("*** after");

        if(scenario.isFailed()){
            byte[] screen=Session.getInstance().getDriver().getScreenshotAs(OutputType.BYTES);
            scenario.attach(screen,"image/png","Movile Failed Step");
        }

        Session.getInstance().closeSession();
        //driver.quit();get
    }


}
