package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LaptopAndBooksTestSteps {
    @When("I Mouse hover on Laptops & Notebooks Tab and click")
    public void iMouseHoverOnLaptopsNotebooksTabAndClick() {
        new HomePage().mouseHoverOnLaptopsAndNotebooksLinkAndClick();
    }

    @And("I Click on “Show All Laptops & Notebooks”")
    public void iClickOnShowAllLaptopsNotebooks() {
        new HomePage().mouseHoverOnShowAllLaptopsAndNotebooksLinkAndClick();
    }

    @And("I Select Sort By {string}")
    public void iSelectSortBy(String option) {
        new DesktopsPage().selectSortByOption(option);
    }

    @Then("I Verify the Product price will arrange in High to Low order.")
    public void iVerifyTheProductPriceWillArrangeInHighToLowOrder() {
        new LaptopAndBooksPage().verifyProductPriceArrangeInHighToLow();
    }

    @And("I Select Product “MacBook”")
    public void iSelectProductMacBook() {
        new LaptopAndBooksPage().selectMacBookProduct();
    }

    @And("I Verify the text “MacBook”")
    public void iVerifyTheTextMacBook() {
        new LaptopAndBooksPage().verifyTheTextMacBook("MacBook");
    }

    @And("I Click on ‘Add To Cart’ button")
    public void iClickOnAddToCartButton() {
        new LaptopAndBooksPage().clickOnAddToCart();
    }

    @And("I Verify the message “Success: You have added MacBook to your shopping cart!”")
    public void iVerifyTheMessageSuccessYouHaveAddedMacBookToYourShoppingCart() {
        new LaptopAndBooksPage().verifySuccessMessageForAddingProductToShoppingCart("Success: You have added MacBook to your shopping cart!\n×");
    }

    @And("I Click on link “shopping cart” display into success message.")
    public void iClickOnLinkShoppingCartDisplayIntoSuccessMessage() {
        new LaptopAndBooksPage().clickOnLinkToShoppingCartMessage();
    }

    @And("I Verify the text {string}")
    public void iVerifyTheText(String arg0) {
        String actualCartText = new ShoppingCartPage().getShoppingCartText();
        String expectedCartText = "Shopping Cart  (0.00kg)";
        Assert.assertEquals(actualCartText, expectedCartText, "Incorrect Shopping Cart Message displayed!");
    }

    @And("I Verify the Product name {string}.")
    public void iVerifyTheProductName(String arg0) {
        String actualProductName = new ShoppingCartPage().verifyProductNameIsMacBook();
        String expectedProductName = "MacBook";
        Assert.assertEquals(actualProductName, expectedProductName, "Incorrect product Name displayed!");

    }

    @And("I Change Quantity {string}")
    public void iChangeQuantity(String qty) {
        new ShoppingCartPage().clearTheQtyBox();
        new ShoppingCartPage().enterQuantityInToTheBox(qty);

    }

    @And("I Click on “Update” Tab")
    public void iClickOnUpdateTab() {
        new ShoppingCartPage().clickOnUpdateTheQuantityBox();
    }

    @And("I Verify the message “Success: You have modified your shopping cart!”")
    public void iVerifyTheMessageSuccessYouHaveModifiedYourShoppingCart() {
        String actualUpdatedMessage = new ShoppingCartPage().verifyUpdatedSuccessMessage();
        String expectedUpdatedMessage = "Success: You have modified your shopping cart!\n×";
        Assert.assertEquals(actualUpdatedMessage, expectedUpdatedMessage, "Incorrect updated message displayed!");
    }

    @And("I Verify the Total £{double}")
    public void iVerifyTheTotal£(int arg0, int arg1) {
        String actualTotalPrice = new ShoppingCartPage().verifyTotalPrice();
        String expectedTotalPrice = "£737.45";
        Assert.assertEquals(actualTotalPrice, expectedTotalPrice, "Incorrect total price displayed!");
    }

    @And("I Click on “Checkout” button")
    public void iClickOnCheckoutButton() {
        new ShoppingCartPage().clickOnCheckOutButton();
    }

    @And("I Verify the text “Checkout”")
    public void iVerifyTheTextCheckout() {
        String actualCheckOutText = new AccountRegisterPage().verifyCheckOutText();
        String expectedCheckOutText = "Checkout";
        Assert.assertEquals(actualCheckOutText, expectedCheckOutText, "Incorrect checkout text displayed!");
    }

    @And("I Verify the Text “New Customer”")
    public void iVerifyTheTextNewCustomer() {
        String actualNewCustomerText = new AccountRegisterPage().verifyTextNewCustomer();
        String expectedNewCustomerText = "Checkout";
        Assert.assertEquals(actualNewCustomerText, expectedNewCustomerText, "Incorrect new customer text displayed!");
    }

    @And("I Click on “Guest Checkout” radio button")
    public void iClickOnGuestCheckoutRadioButton() {
        new AccountRegisterPage().clickOnGuestCheckOutButton();
    }

    @And("I Click on “Continue” tab")
    public void iClickOnContinueTab() {
        new AccountRegisterPage().clickOnContinueButtonTab();
    }

    @And("I Fill the mandatory fields")
    public void iFillTheMandatoryFields() {
        new AccountRegisterPage().fillAllMandatoryField("Mary", "John", "maryjohn@gmail.com", "918-456-1234",
                "2250 144th street", "Tulsa", "71433", "United States", "Oklahoma");
    }

    @And("I Click on “Continue” Button")
    public void iClickOnContinueButton() {
        new AccountRegisterPage().clickOnContinueButtonForGuest();
    }

    @And("I Add Comments About your order into text area")
    public void iAddCommentsAboutYourOrderIntoTextArea() {
        new AccountRegisterPage().addCommentsAboutYourOrderIntoTheTextArea("Leave it By near Door Plzz");
    }

    @And("I Check the Terms & Conditions check box")
    public void iCheckTheTermsConditionsCheckBox() {
        new AccountRegisterPage().clickOnCheckBoxForTermsAndConditions();
    }

    @And("I Click on “Continue” button{int}")
    public void iClickOnContinueButton(int arg0) {
        new AccountRegisterPage().clickOnContinueButtonForPaymentMethod();
    }

    @And("I Verify the message “Warning: Payment method required!”")
    public void iVerifyTheMessageWarningPaymentMethodRequired() {
        String actualWarningText = new AccountRegisterPage().verifyWarningMessageForPaymentMethod();
        String expectedWarningText = "Warning: Payment method required!\n×";
        Assert.assertEquals(actualWarningText, expectedWarningText, "Incorrect warning message displayed!");
    }
}
