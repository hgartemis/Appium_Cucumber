package runner;

import activities.ContactManagerClean.ContactMainScreen;
import activities.ContactManagerClean.CreateContactScreen;
import activities.ContactManagerClean.UpdateDialog;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.net.MalformedURLException;

public class MyStepContactClean {
    ContactMainScreen contactMainScreen = new ContactMainScreen();
    CreateContactScreen createContactScreen = new CreateContactScreen();
    UpdateDialog updateDialog= new UpdateDialog();


    @Given("I have access to contactManager")
    public void iHaveAccessToContactManager() {
    }

    @And("I accept the update the app if dialog appers")
    public void iAcceptTheUpdateTheAppIfDialogAppers() throws MalformedURLException {
        if (updateDialog.buttonMap.get("okButton").isControlDisplayed())
            updateDialog.buttonMap.get("okButton").click();
    }

    @When("I click on {string} button")
    public void iClickOnButton(String nameButton) throws MalformedURLException {
        createContactScreen.buttonMap.get(nameButton).click();
    }

    @And("I type {string} in {string} TextBox")
    public void iTypeInTextBox(String value, String nameControl) throws MalformedURLException {
        createContactScreen.textboxMap.get(nameControl).type(value);
    }

    @Then("the contact {string} should be displayed")
    public void theContactShouldBeDisplayed(String expectedResult) {
        Assert.assertTrue("ERROR contacto no creado",contactMainScreen.contactIsDisplayed(expectedResult));
    }

    @When("I click on {string} button main screen")
    public void iClickOnButtonMainScreen(String controlName) throws MalformedURLException {
        contactMainScreen.buttonMap.get(controlName).click();
    }
}
