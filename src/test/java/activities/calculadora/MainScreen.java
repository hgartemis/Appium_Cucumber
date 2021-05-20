package activities.calculadora;

import controlAppium.Button;
import controlAppium.Label;
import org.openqa.selenium.By;

public class MainScreen {

    public Button sevenButton = new Button(By.id("com.android.calculator2:id/digit_7"));
    public Button oneButton = new Button(By.id("com.android.calculator2:id/digit_1"));
    public Button plusButton = new Button(By.id("com.android.calculator2:id/op_add"));
    public Button equalButton = new Button(By.id("com.android.calculator2:id/eq"));
    public Label resultLabel = new Label(By.id("com.android.calculator2:id/result"));

    public MainScreen(){}

}
