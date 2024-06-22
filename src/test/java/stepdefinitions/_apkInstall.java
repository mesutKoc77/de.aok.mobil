package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.Given;
import org.openqa.selenium.remote.DesiredCapabilities;
import utilities.ConfigReader;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class _apkInstall {


    AndroidDriver<AndroidElement> driver;
    static final String deviceName = "Pixel 7 API 33";
    static final String platform = "Android";
    static final String androidVersion = "13.0";
    static final String otomationName = "UiAutomator2";
    public static String url = "http://127.0.0.1:4723/wd/hub";

    @Given("Kullanici ihtiyac duyulan bilgilerle teste konu {string} yukler")
    public void kullanici_ihtiyac_duyulan_bilgilerle_teste_konu_apk_yukler(String apkPath) throws MalformedURLException {


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platform);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, androidVersion);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, otomationName);
        capabilities.setCapability(MobileCapabilityType.APP, ConfigReader.getProperty(apkPath));

        driver = new AndroidDriver<AndroidElement>(new URL(url), capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }


}
