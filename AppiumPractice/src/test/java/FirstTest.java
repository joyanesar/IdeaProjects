import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
//import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class FirstTest {
    AppiumDriver<MobileElement> driver;
//    @Test
//    public void test1() throws MalformedURLException, InterruptedException {

//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("device","Pixel 5");
//        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10");
//        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiAutomator2");
//       capabilities.setCapability(MobileCapabilityType.APP, "https://cybertek-appium.s3.amazonaws.com/etsy.apk");
//
//        URL url = new URL("http://localhost:4723/wd/hub");
//        driver = new AndroidDriver<MobileElement>(url,capabilities);
//        Thread.sleep(3000);
////        driver.closeApp();


    //    }
//}
  //  @Test
    public void test1() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "10.0");
        desiredCapabilities.setCapability("deviceName", "Pixel 3");
        //android apps have .apk extension
        //file can be stored locally or in a cloud storage
        desiredCapabilities.setCapability("app", "https://cybertek-appium.s3.amazonaws.com/calculator.apk");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        //address of appium server
        URL url = new URL("http://localhost:4723/wd/hub");
        AppiumDriver<MobileElement> driver = new AndroidDriver<>(url, desiredCapabilities);
        //
        WebDriverWait driverWait = new WebDriverWait(driver,20);
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.google.android.calculator:id/digit_9")));

        driver.findElementById("com.google.android.calculator:id/digit_9").click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
        driver.findElement(MobileBy.AccessibilityId("plus")).click();
        driver.findElementById("com.google.android.calculator:id/digit_4").click();

        MobileElement equals = driver.findElement(MobileBy.AccessibilityId("equals"));
        equals.click();
//        Thread.sleep(3000);

        By resultBy = By.id("com.google.android.calculator:id/result_final");
        //wait.until(ExpectedConditions.presenceOfElementLocated(resultBy));
        MobileElement result = driver.findElement(resultBy);
    }
}