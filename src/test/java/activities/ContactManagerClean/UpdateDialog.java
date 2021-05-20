package activities.ContactManagerClean;

import controlAppium.Button;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class UpdateDialog {

    public Map<String,Button> buttonMap = new HashMap<>();
    public UpdateDialog(){
        buttonMap.put("okButton",new Button(By.id("android:id/button1")));
    }

}
