package factoryDevices;

import io.cucumber.java.en_scouse.An;

public class FactoryDevice {

    public static final String ANDROID = "android";
    public static final String IOS = "ios";
    public static final String WINDOWMS = "windows";
    public static final String CLOUD = "cloud";

    public static IDevice make(String typeDevice) {
        IDevice device = null;

        switch (typeDevice) {

            case ANDROID:
                device = new Android();
                break;
            case IOS:
                device = new Ios();
                break;
            case CLOUD:
                device = new CloudAndroid();
                break;

            case "windows":
                //device = new WindowPhone();
                break;

        }
        return device;

    }

}
