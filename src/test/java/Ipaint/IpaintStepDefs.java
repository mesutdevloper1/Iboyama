package Ipaint;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


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




    @Given("^user see <X>|<page>$")
    public void user_see_X_button(String something) {

    }

    @Given("^user click <page>$")
    public void user_click() {

    }
    @When("^user click <X> button$")
    public void X_btn() {
    }
    @Then("^wait <x> second$")
    public void wait_time(int x) {

    }
    @And("^user click x={X} y={Y} screen")
    public void click_here(int X,int Y) {

    }
    @Given("^user swipe until see <no1 image>$")
    public void swipe_until() {

    }
}
