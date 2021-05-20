package singletonSesion;

import basicTest.AppiumBasic;
import factoryDevices.FactoryDevice;
import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

public class Session {

    // attributo del mismo tipo de la clase
    private static Session session = null;
    private AppiumDriver driver;

    // constructor private
    private Session() throws MalformedURLException {
        driver = FactoryDevice.make(FactoryDevice.ANDROID).create();
    }

    // metodo publico estatio que devuelva la session unica
    // para ejecutar paralelamente usando singleton evitar usar: synchronized
    public static Session getInstance() throws MalformedURLException {
        if (session == null)
                session = new Session();

        return session;
    }

    public AppiumDriver getDriver() {
        return driver;
    }

    public void closeSession(){
        driver.quit();
        session=null;
    }

}
