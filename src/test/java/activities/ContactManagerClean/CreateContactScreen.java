package activities.ContactManagerClean;

import controlAppium.Button;
import controlAppium.TextBox;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class CreateContactScreen {

    public Map<String,TextBox> textboxMap= new HashMap<>();
    public Map<String,Button> buttonMap= new HashMap<>();

    public CreateContactScreen(){
        textboxMap.put("phoneTextBox",new TextBox(By.id("com.example.android.contactmanager:id/contactPhoneEditText")));
        textboxMap.put("nameTextBox",new TextBox(By.id("com.example.android.contactmanager:id/contactNameEditText")));
        textboxMap.put("emailTextBox",new TextBox(By.id("com.example.android.contactmanager:id/contactEmailEditText")));
        buttonMap.put("saveButton",new Button(By.id("com.example.android.contactmanager:id/contactSaveButton")));
    }

}
