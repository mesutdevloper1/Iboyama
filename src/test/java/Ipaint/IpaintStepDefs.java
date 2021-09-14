package Ipaint;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class IpaintStepDefs {
    private AndroidDriver<MobileElement> driver;

    public void setUp() throws MalformedURLException {

        String appiumServerURL = "http://localhost:4723/wd/hub";

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName","poco x3");
        capabilities.setCapability("platformVersion", "172");
        capabilities.setCapability("appPackage", "com.teknasyon.coloringbook");
        capabilities.setCapability("appActivity", "com.teknasyon.coloringbook.ColoringApplication");
        capabilities.setCapability("udid", "c33f53b0");


        driver = new AndroidDriver<MobileElement>(new URL(appiumServerURL), capabilities);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }



    @Given("^user see \"(.*)\"$")
    public void user_see_page(String page) {
        List<MobileElement> elementsOne = (List<MobileElement>) driver.findElementsByAccessibilityId("page");
    }
    @Given("^user see <X>$")
    public void user_see_X_button(String X) {
        List<MobileElement> elementsOne = (List<MobileElement>) driver.findElementsByAccessibilityId("X");
    }

    @Given("^user click <page>$")
    public void user_click(String element) {
        TouchActions action = new TouchActions(driver);
        action.singleTap(element);
        action.perform();

    }
    @When("^user click <X> button$")
    public void X_btn(String Id) {
        MobileElement el = driver.findElementByAccessibilityId("Id");
        el.click();


    }

    @Then("^wait <x> second$")
    public void wait_time(int x) {
        driver.manage().timeouts().implicitlyWait(x, TimeUnit.SECONDS);
    }
    @And("^user click x={X} y={Y} screen")
    public void click_here(int X,int Y) {
        TouchAction startStop = new TouchAction(driver),
        .tap(element(driver.findElementById("..."), X, Y));

    }
    @Given("^user swipe until see <no1 image>$")
        public void swipe_until(String visibleText) {
            androidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))");
        }
    }

}
