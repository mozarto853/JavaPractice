package AndroidTesting.RealPhone;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class IGTestRealPhone {

    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "9");
        desiredCapabilities.setCapability("deviceName", "98892a42355a4e474f");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("appPackage","com.instagram.android");
        desiredCapabilities.setCapability("appActivity",".activity.MainTabActivity");
        desiredCapabilities.setCapability("noReset",true);


        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        AppiumDriver driver = new AndroidDriver(url, desiredCapabilities);
        String sessionId = driver.getSessionId().toString();




        MobileElement el1 = (MobileElement) driver.findElementById("com.instagram.android:id/tab_avatar");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByXPath("//android.view.View[@content-desc=\"12Following\"]/android.widget.TextView[2]");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Photo by VivaLaGrace at Row 1, Column 1");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Liked");
        el5.click();


    }
}
