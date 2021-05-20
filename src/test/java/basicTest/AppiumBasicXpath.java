package basicTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumBasicXpath {

    private AppiumDriver driver;

    @Before
    public void initAppium() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","GalaxyNote9");
        capabilities.setCapability("platformVersion","10");
        capabilities.setCapability("appPackage","com.sec.android.app.popupcalculator");
        capabilities.setCapability("appActivity",".Calculator");
        capabilities.setCapability("platformName","Android");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void verifyAddition() throws InterruptedException {

        driver.findElement(By.xpath("//android.widget.Button[@content-desc='7']")).click();
        driver.findElement(By.xpath("//android.widget.Button[@text='+']")).click();
        driver.findElement(By.xpath("//android.widget.Button[@content-desc='1']")).click();
        driver.findElement(By.xpath("//android.widget.Button[@text='=']")).click();

        String resulE = "8";
        String resulA = driver.findElement(By.xpath("@resource-id='com.sec.android.app.popupcalculator:id/calc_edt_formula']")).getText();

        Assert.assertEquals("Error! la suma es incorrecta",resulE,resulA);

        Thread.sleep(5000);
    }

    @After
    public void closeApp() {
        driver.quit();
    }

}
