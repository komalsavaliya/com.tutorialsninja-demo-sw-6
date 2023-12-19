package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.UUID;

public class AccountRegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountRegisterPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register Account')]")
    WebElement registerAccountText;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Checkout']")
    WebElement checkOutText;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='New Customer'])[1]")
    WebElement verifyTextNewCustomer;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='New Customer'])[1]")
    WebElement guestCheckOutButton;

    @CacheLookup
    @FindBy(css = "#button-account")
    WebElement continueTabButton;

    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement telephoneField;

    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-confirm']")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(id = "input-payment-address-1")
    WebElement addressField;

    @CacheLookup
    @FindBy(id = "input-payment-city")
    WebElement cityName;

    @CacheLookup
    @FindBy(name = "postcode")
    WebElement zipCode;

    @CacheLookup
    @FindBy(id = "input-payment-country")
    WebElement countryName;

    @CacheLookup
    @FindBy(id = "input-payment-zone")
    WebElement zoneName;


    @CacheLookup
    @FindBy(xpath = "//input[@id='button-guest']")
    WebElement addCommentIn;

    @CacheLookup
    @FindBy(css = "input[value='1'][name='agree']")
    WebElement termsAndConditions;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-payment-method']")
    WebElement continueButtonForPayment;

    @CacheLookup
    @FindBy(xpath = "//div[@class ='alert alert-danger alert-dismissible']")
    WebElement checkWarningForPayment;


    @CacheLookup
    @FindBy(xpath = "//fieldset[3]//input")
    List<WebElement> subscribeRadios;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@name='agree']")
    WebElement privacyPolicyCheckBox;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@value='Continue']")
    WebElement continueBtn;

    public String getRegisterAccountText() {
        log.info("Getting register account text : " + registerAccountText.toString());
        return getTextFromElement(registerAccountText);
    }
    public String verifyCheckOutText() {
        log.info("Getting text : " + checkOutText.toString());
        return getTextFromElement(checkOutText);
    }

    public String verifyTextNewCustomer() {
        log.info("Getting text : " + verifyTextNewCustomer().toString());
        return getTextFromElement(verifyTextNewCustomer);
    }

    public void clickOnGuestCheckOutButton() {
        clickOnElement(guestCheckOutButton);
        log.info("Guest check out Button : " + guestCheckOutButton.toString());
    }

    public void clickOnContinueButtonTab() {
        clickOnElement(continueTabButton);
        log.info("Continue Tab Button : " + continueTabButton.toString());
    }

    public void fillAllMandatoryField(String name, String surname, String email, String phone,
                                      String address, String city, String postcode, String country, String zone) {
        sendTextToElement(firstNameField, name);
        log.info("Enter first name : " + firstNameField.toString());
        sendTextToElement(lastNameField, surname);
        log.info("Enter last name : " + lastNameField.toString());
        sendTextToElement(emailField, email);
        log.info("Enter email : " + emailField.toString());
        sendTextToElement(telephoneField, phone);
        log.info("Enter Telephone : " + telephoneField.toString());
        sendTextToElement(addressField, address);
        log.info("Enter Address : " + address.toString());
        sendTextToElement(cityName, city);
        log.info("Enter City name : " + city.toString());
        sendTextToElement(zipCode, postcode);
        log.info("Enter Zip Code : " + zipCode.toString());
        selectByVisibleTextFromDropDown(countryName, country);
        log.info("Enter Country name : " + countryName.toString());
        selectByVisibleTextFromDropDown(zoneName, zone);
        log.info("Enter State : " + zone.toString());
    }

    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
        log.info("Enter first name : " + firstName.toString());
    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
        log.info("Enter last name : " + lastName.toString());
    }

    final String randomEmail = randomEmail();

    public void enterEmail(String emailAddress) {
        sendTextToElement(emailField, emailAddress);
        log.info("Enter email : " + emailAddress + " in email field " + emailField.toString());
    }

    public static String randomEmail() {
        return "random-" + UUID.randomUUID().toString() + "@gmail.com";
    }

    public void enterTelephone(String telephone) {
        sendTextToElement(telephoneField, telephone);
        log.info("Enter Telephone : " + telephoneField.toString());
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("Enter password : " + passwordField.toString());

    }

    public void enterConfirmPassword(String confirmPassword) {
        sendTextToElement(confirmPasswordField, confirmPassword);
        log.info("Enter confirm password : " + confirmPasswordField.toString());
    }

    public void selectSubscription(String option) {
        List<WebElement> radioButtons = subscribeRadios;
        for (WebElement e : radioButtons) {
            if (e.getText().equals(option)) {
                e.click();
                break;
            }
        }
        log.info("Selecting subscription: " + subscribeRadios.toString());
    }

    public void clickOnPrivacyPolicyCheckBox() {
        clickOnElement(privacyPolicyCheckBox);
        log.info("Click on privacy policy check box : " + privacyPolicyCheckBox.toString());

    }

    public void clickOnContinueButton() {
        clickOnElement(continueBtn);
        log.info("Click on continue button : " + continueBtn.toString());
    }

    public void registerUser(String fName, String lName, String age) {
        enterLastName(fName);
        enterLastName(lName);
     }
public void clickOnContinueButtonForGuest() {
    clickOnElement(continueButtonForPayment);
    log.info("Button for Guest : " + continueButtonForPayment.toString());
}

    public void addCommentsAboutYourOrderIntoTheTextArea(String comment) {
        sendTextToElement(addCommentIn, comment);
        log.info("Add Comment : " + addCommentIn.toString());
    }

    public void clickOnCheckBoxForTermsAndConditions() {
        clickOnElement(termsAndConditions);
        log.info("Terms and Condition Box  : " + termsAndConditions.toString());
    }

    public void clickOnContinueButtonForPaymentMethod() {
        clickOnElement(continueButtonForPayment);
        log.info("Continue Button for payment Method : " + continueButtonForPayment.toString());
    }

    public String verifyWarningMessageForPaymentMethod() {
        log.info("Getting Text : " + checkWarningForPayment.toString());
        return getTextFromElement(checkWarningForPayment);

    }
}


