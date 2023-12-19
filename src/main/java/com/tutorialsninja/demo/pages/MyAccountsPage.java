package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MyAccountsPage extends Utility {
    private static final Logger log = LogManager.getLogger(MyAccountsPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    WebElement accountCreation;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    WebElement continueAccountButton;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement accountLogOutText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueLogOutButton;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginButton;


    public String verifyTheMessageYourAccountHasBeenCreated() {
        log.info("Getting account has been crated : " + accountCreation);
        return getTextFromElement(accountCreation);
    }
    public void clickOnContinueAccountButton() {
        clickOnElement(continueAccountButton);
        log.info("Click On Button : " + continueAccountButton.toString());
    }

    public String verifyTextForAccountLogOut() {
        log.info("Getting accountlogout text : " + accountLogOutText);
        return getTextFromElement(accountLogOutText);
    }

    public void clickOnContinueLogOutButton() {
        clickOnElement(continueLogOutButton);
        log.info("Click on continue logOut button: " + continueLogOutButton);
    }
    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Click On Button : " + loginButton.toString());
    }
}
