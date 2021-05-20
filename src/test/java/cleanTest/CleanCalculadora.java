package cleanTest;

import activities.calculadora.MainScreen;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import singletonSesion.Session;

import java.net.MalformedURLException;

public class CleanCalculadora {

    MainScreen mainScreen= new MainScreen();

    @Test
    public void verifyAddition() throws InterruptedException, MalformedURLException {
        mainScreen.sevenButton.click();
        mainScreen.plusButton.click();
        mainScreen.oneButton.click();
        mainScreen.equalButton.click();
        Assert.assertEquals("ERROR, la suma es incorrecta","8",mainScreen.resultLabel.getText());
    }

    @After
    public void closeApp() throws MalformedURLException {
        Session.getInstance().closeSession();
    }

}
