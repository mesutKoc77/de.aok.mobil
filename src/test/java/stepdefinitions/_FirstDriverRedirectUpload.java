package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.ConfigReader;
import utilities.Driver;

public class _FirstDriverRedirectUpload {

    @Given("User Installs the Driver and directs it to the application under test with {string} and {string}.")
    public void userInstallsTheDriverAndDirectsItToTheApplicationUnderTestWithAnd(String AppPackage, String AppActivity) {
        Driver.appPackage =ConfigReader.getProperty(AppPackage);
        Driver.appActivity = ConfigReader.getProperty(AppActivity);
        Driver.getAndroidDriver();

    }
}
