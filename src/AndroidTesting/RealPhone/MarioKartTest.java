package AndroidTesting.RealPhone;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MarioKartTest {
    public static void main(String [] args) throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "9");
        desiredCapabilities.setCapability("deviceName", "98892a42355a4e474f");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("appPackage","com.nintendo.zaka");
        desiredCapabilities.setCapability("appActivity","com.google.firebase.MessagingUnityPlayerActivity");
        desiredCapabilities.setCapability("noReset",true);

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        AppiumDriver driver = new AndroidDriver(url, desiredCapabilities);
        String sessionId = driver.getSessionId().toString();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);


        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(PointOption.point(179, 738)).perform(); //click course
        touchAction.tap(PointOption.point(249,746)).perform(); //click character
        touchAction.tap(PointOption.point(202,761)).perform(); //click car
        touchAction.tap(PointOption.point(198, 1705)).perform(); //click glider
        touchAction.tap(PointOption.point(532, 1068)).perform(); //click auto mode
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
        touchAction.tap(PointOption.point(575, 1115)).perform(); //tap during result screen
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        touchAction.tap(PointOption.point(420, 1907)).perform(); //tap ok
        //done. Reset

    }
}
