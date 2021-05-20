package cleanTest;

import activities.contactManager.ContactMainScreen;
import activities.contactManager.CreateContactScreen;
import activities.contactManager.UpdateDialog;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import singletonSesion.Session;

import java.net.MalformedURLException;

public class CleanContactManager {

    ContactMainScreen contactMainScreen = new ContactMainScreen();
    CreateContactScreen createContactScreen = new CreateContactScreen();
    UpdateDialog updateDialog= new UpdateDialog();

    @Test
    public void verifyAddition() throws InterruptedException, MalformedURLException {
        String name = "AAAAARemoveeee";
        String phone = "44444444";
        String email = "remove@removeee.com";

        if (updateDialog.okButton.isControlDisplayed())
            updateDialog.okButton.click();

        contactMainScreen.addContactButton.click();
        createContactScreen.nameTextBox.type(name);
        createContactScreen.phoneTextBox.type(phone);
        createContactScreen.emailTextBox.type(email);
        createContactScreen.saveButton.click();

        Assert.assertTrue("ERROR contacto no creado", contactMainScreen.contactIsDisplayed(name));
    }

    @After
    public void closeApp() throws MalformedURLException {
        Session.getInstance().closeSession();
    }

}
