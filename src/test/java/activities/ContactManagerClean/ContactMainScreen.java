package activities.ContactManagerClean;

import controlAppium.Button;
import controlAppium.Label;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class ContactMainScreen {

    public Map<String,Button> buttonMap = new HashMap<>();
    public ContactMainScreen(){
        buttonMap.put("addContactButton",new Button(By.id("com.example.android.contactmanager:id/addContactButton")));
    }

    public boolean contactIsDisplayed(String contactName){
        Label contact= new Label(By.xpath("//android.widget.TextView[@text='"+contactName+"']"));
        return contact.isControlDisplayed();
    }



}
