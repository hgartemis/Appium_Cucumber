package activities.contactManager;

import controlAppium.Button;
import controlAppium.Label;
import org.openqa.selenium.By;

public class ContactMainScreen {

    public Button addContactButton= new Button(By.id("com.example.android.contactmanager:id/addContactButton"));

    public ContactMainScreen(){}

    public boolean contactIsDisplayed(String contactName){
        Label contact= new Label(By.xpath("//android.widget.TextView[@text='"+contactName+"']"));
        return contact.isControlDisplayed();
    }

}
