package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class AokPage {

    public AokPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)), this);
    }

    @FindBy(xpath = "//*[@text='Akzeptieren']")
    public MobileElement akzeptierenButton;

    @FindBy(xpath = "//*[@text='Jetzt Registrieren']")
    public MobileElement jetztRegistrierenButton;

    @FindBy(xpath = "//*[@text='Zustimmung erforderlich']")
    public MobileElement zustimmungCheckbox;

    @FindBy(xpath = "//*[@text='Weiter']")
    public MobileElement weiterButton;

    @FindBy(xpath = "//*[@text='Versichertennummer']")
    public MobileElement versicherungsnummerField;

    @FindBy(xpath = "//*[@text='Benutzername']")
    public MobileElement benutzernameField;

    @FindBy(xpath = "//*[@text='E-Mail']")
    public MobileElement emailField;

    @FindBy(xpath = "//*[@text='E-Mail wiederholen']")
    public MobileElement emailWiederholenField;

    @FindBy(xpath = "//*[@text='Ich willige ein...']")
    public MobileElement willigeTextBox;

    @FindBy(id = "passwordField")
    public MobileElement passwordField;

    @FindBy(xpath = "//input[@id='mobilePhoneNumber']")
    public MobileElement mobilePhoneNumberField;

    @FindBy(xpath = "//button[contains(text(),'Code anfordern')]")
    public MobileElement codeRequestButton;

    @FindBy(xpath = "//button[contains(text(),'Code bestätigen')]")
    public MobileElement codeConfirmationButton;

    @FindBy(xpath = "//button[contains(text(),'Verify Email')]")
    public MobileElement verifyEmailButton;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Check your email inbox')]")
    public MobileElement textElement;




}
