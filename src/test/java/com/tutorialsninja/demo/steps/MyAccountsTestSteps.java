package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.AccountLoginPage;
import com.tutorialsninja.demo.pages.AccountRegisterPage;
import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.MyAccountsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MyAccountsTestSteps {
    @When("I Click on My Account Link.")
    public void iClickOnMyAccountLink() throws InterruptedException {
        Thread.sleep(4000);
        new HomePage().clickOnMyAccountTab();
    }

    @And("I call the method select my account option and pass parameter {string}")
    public void iCallTheMethodSelectMyAccountOptionAndPassParameter(String parameter) {
        new HomePage().selectMyAccountOptions(parameter);
    }

    @And("I should navigate to register page")
    public void iShouldNavigateToRegisterPage() {
    }

    @Then("I Verify the text Register Account.")
    public void iVerifyTheTextRegisterAccount(String register) {
        Assert.assertEquals(new AccountRegisterPage().getRegisterAccountText(), register, "Incorrect Text");
    }

    @And("I Call the method {string} method and pass the parameter {string}")
    public void iCallTheMethodMethodAndPassTheParameter(String login) {
        new HomePage().selectMyAccountOptions("Login");
    }

    @Then("I Verify the text {string}.")
    public void iVerifyTheText(String login) {
        Assert.assertEquals(new AccountLoginPage().getReturningCustomerText(), login, "Incorrect Text");
    }

    @And("I Enter First Name")
    public void iEnterFirstName() {
        new AccountRegisterPage().enterFirstName("Mary");
    }

    @And("I Enter Last Name")
    public void iEnterLastName() {
        new AccountRegisterPage().enterLastName("John");
    }

    @And("I Enter Email")
    public void iEnterEmail() {
        final String randomEmail;
        randomEmail = AccountRegisterPage.randomEmail();
        new AccountRegisterPage().enterEmail(randomEmail);
    }

    @And("I Enter Telephone")
    public void iEnterTelephone() {
        new AccountRegisterPage().enterTelephone("918-456-1234");
    }

    @And("I Enter Password")
    public void iEnterPassword() {
        new AccountRegisterPage().enterPassword("123456");
    }

    @And("I Enter Password Confirm")
    public void iEnterPasswordConfirm() {
        new AccountRegisterPage().enterConfirmPassword("123456");
    }

    @And("I Select Subscribe Yes radio button")
    public void iSelectSubscribeYesRadioButton() {
        new AccountRegisterPage().selectSubscription("No");
    }

    @And("I Click on Privacy Policy check box")
    public void iClickOnPrivacyPolicyCheckBox() {
        new AccountRegisterPage().clickOnCheckBoxForTermsAndConditions();
    }

    @And("I Click on Continue button")
    public void iClickOnContinueButton() {
        new AccountRegisterPage().clickOnContinueButton();
    }

    @And("I Verify the message {string}")
    public void iVerifyTheMessage(String arg0) {
        String actualMessage = new MyAccountsPage().verifyTheMessageYourAccountHasBeenCreated();
        String expectedMessage = "Your Account Has Been Created!";
        Assert.assertEquals(actualMessage, expectedMessage, "Incorrect message displayed!");
    }

    @And("I Clickr on My Account Link.")
    public void iClickrOnMyAccountLink() {
        new MyAccountsPage().clickOnContinueAccountButton();
    }

    @And("I Call the method “selectMyAccountOptions” method and pass the parameter {string}")
    public void iCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameter(String parameter) {
        new HomePage().selectMyAccountOptions("Logout");
    }

    @And("I  Verify the text “Account Logout”")
    public void iVerifyTheTextAccountLogout() {
        String actualLogoutText = new MyAccountsPage().verifyTextForAccountLogOut();
        String expectedLogOutText = "Logout";
        Assert.assertEquals(actualLogoutText, expectedLogOutText, "Incorrect logout message displayed!");

    }

    @And("I Enter Email address")
    public void iEnterEmailAddress() {
        new AccountRegisterPage().enterEmail("maryjohn@gamil.com");

    }

    @And("I Click on Login button")
    public void iClickOnLoginButton() {
        new MyAccountsPage().clickOnLoginButton();
    }

    @And("I Verify text {string}")
    public void iVerifyText(String arg0) {
        String actualLogoutText = new MyAccountsPage().verifyTextForAccountLogOut();
        String expectedLogOutText = "Logout";
        Assert.assertEquals(actualLogoutText, expectedLogOutText, "Incorrect logout message displayed!");
    }

    @And("And I Call the method “selectMyAccountOptions” method and pass the parameter {string}")
    public void andICallTheMethodSelectMyAccountOptionsMethodAndPassTheParameter(String parameter) {
        new HomePage().selectMyAccountOptions(parameter);
    }
}





