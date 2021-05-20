package basicTest;

import javafx.scene.layout.Priority;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitBasic {

    @Before
    public void before() {
        System.out.println("Before TEST");
    }


    @After
    public void after() {
        System.out.println("After TEST");
    }

    @Test
    public void verifyTheUnitIsWorking() {
        System.out.println("esto es un TEST!");
    }

    @Test
    public void verifyTheUnitIsWorking1() {
        System.out.println("esto es un TEST!");
    }
}
