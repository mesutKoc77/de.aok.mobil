package stepdefinitions;

import com.github.javafaker.Faker;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AokPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.WaitHelper;


public class Aok {


    AndroidDriver<AndroidElement> driver = Driver.getAndroidDriver();
    Faker faker = new Faker();
    AokPage aokPage = new AokPage();

    @Given("the user opens MeineAok application and chooses his {string}")
    public void theUserOpensMeineAokApplicationAndChoosesHis(String branchname) {
        ReusableMethods.scrollWithUiScrollable(branchname);
    }

    @When("the user clicks the Akzeptieren button")
    public void theUserClicksTheAkzeptierenButton() {
        WaitHelper.waitForClickablility(aokPage.akzeptierenButton, 10).click();
    }

    @When("the user clicks the Jetzt Registrieren button")
    public void theUserClicksTheJetztRegistrierenButton() {
        WaitHelper.waitForClickablility(aokPage.jetztRegistrierenButton, 10).click();
    }


    @When("the user accepts Zustimmung erforderlich and clicks the Weiter button")
    public void theUserAcceptsZustimmungErforderlichAndClicksTheWeiterButton() {
        WaitHelper.waitForClickablility(aokPage.zustimmungCheckbox, 10).click();
        WaitHelper.waitForClickablility(aokPage.weiterButton, 10).click();
    }


    @When("the user enters the card number in the Versicherungsnummer field and clicks the Weiter button")
    public void theUserEntersTheCardNumberInTheVersicherungsnummerFieldAndClicksTheWeiterButton() {
        WaitHelper.waitForClickablility(aokPage.versicherungsnummerField, 10).sendKeys(faker.number().digits(9));  // Example card number
        WaitHelper.waitForClickablility(aokPage.weiterButton, 10).click();

    }

    @When("the user fills in the Benutzername, E-Mail and E-Mail wiederholen fields")
    public void theUserFillsInTheBenutzernameEMailAndEMailWiederholenFields() {
        String randomEmail = faker.internet().emailAddress();
        WaitHelper.waitForClickablility(aokPage.benutzernameField, 10).sendKeys(faker.name().username());  // Example username
        WaitHelper.waitForClickablility(aokPage.emailField, 10).sendKeys(randomEmail);  // Sample email
        WaitHelper.waitForClickablility(aokPage.emailWiederholenField, 10).sendKeys(randomEmail);  // Email repeat
    }

    @And("the user checks the Ich willige ein... text box")
    public void theUserChecksTheIchWilligeEinTextBox() {
        WaitHelper.waitForClickablility(aokPage.willigeTextBox, 10).click();

    }

    @And("the user clicks the Weiter button")
    public void theUserClicksTheWeiterButton() {
        WaitHelper.waitForClickablility(aokPage.weiterButton, 10).click();
    }

    @When("the user enters the information in the relevant fields in the Password area")
    public void theUserEntersTheInformationInTheRelevantFieldsInThePasswordArea() {
        WaitHelper.waitForClickablility(aokPage.passwordField, 10).click();
    }


    @When("the user enters his mobile phone information")
    public void theUserEntersHisMobilePhoneInformation() {
        WaitHelper.waitForClickablility(aokPage.mobilePhoneNumberField, 10).sendKeys(faker.number().digits(9));
    }

    @And("the user clicks the Code anfordern button")
    public void theUserClicksTheCodeAnfordernButton() {
        WaitHelper.waitForClickablility(aokPage.codeRequestButton, 10).click();
    }

    @When("the user clicks the Code bestätigen button")
    public void theUserClicksTheCodeBestätigenButton() {
        WaitHelper.waitForClickablility(aokPage.codeConfirmationButton,10).click();
    }


    @When("the user verifies his email address")
    public void theUserVerifiesHisEmailAddress() {
        WaitHelper.waitForClickablility(aokPage.verifyEmailButton,10).click();
    }


    @Then("the user should receive the email that the Freischaltcode will be sent to his home")
    public void theUserShouldReceiveTheEmailThatTheFreischaltcodeWillBeSentToHisHome() {
        Assert.assertTrue("Text element does not contain expected text",
                aokPage.textElement.getText().contains("Check your email inbox"));
        //i have made some changes.
    }
}
