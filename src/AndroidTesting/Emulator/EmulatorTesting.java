package AndroidTesting.Emulator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;

public class EmulatorTesting {
    public static void main(String [] args) throws MalformedURLException {


        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        dc.setCapability("platformName","android");
        dc.setCapability("appPackage","com.android.calculator2");
        dc.setCapability("appActivity",".Calculator");

        AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);

        MobileElement el1 = (MobileElement) ad.findElementById("com.android.calculator2:id/digit_0");
        el1.click();
        MobileElement el2 = (MobileElement) ad.findElementById("com.android.calculator2:id/digit_1");
        el2.click();
        MobileElement el3 = (MobileElement) ad.findElementByAccessibilityId("minus");
        el3.click();
        MobileElement el4 = (MobileElement) ad.findElementById("com.android.calculator2:id/digit_2");
        el4.click();
        MobileElement el5 = (MobileElement) ad.findElementById("com.android.calculator2:id/digit_5");
        el5.click();
        MobileElement el6 = (MobileElement) ad.findElementByAccessibilityId("minus");
        el6.click();
        MobileElement el7 = (MobileElement) ad.findElementById("com.android.calculator2:id/digit_1");
        el7.click();
        MobileElement el8 = (MobileElement) ad.findElementById("com.android.calculator2:id/digit_9");
        el8.click();
        MobileElement el9 = (MobileElement) ad.findElementById("com.android.calculator2:id/digit_9");
        el9.click();
        MobileElement el10 = (MobileElement) ad.findElementById("com.android.calculator2:id/digit_8");
        el10.click();
        MobileElement el11 = (MobileElement) ad.findElementByAccessibilityId("equals");
        el11.click();


        Assert.assertEquals(ad.findElementById("com.android.calculator2:id/result").getText(),2022);


    }

}
