package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.DesktopsPage;
import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.ProductPage;
import com.tutorialsninja.demo.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class DeskTopsTestStep {
    @And("I Click on “Show AllDesktops”")
    public void iClickOnShowAllDesktops() {
        new HomePage().mouseHoverOnShowAllDesktopsLinkAndClick();
    }

    @And("I Select Sort By position {string}")
    public void iSelectSortByPosition(String option) {
        new DesktopsPage().selectSortByOption(option);

    }

    @Then("I Verify the Product will arrange in Descending order.")
    public void iVerifyTheProductWillArrangeInDescendingOrder() {
        new DesktopsPage().verifySortedElementsInReverseOrder();
    }

    @When("I Mouse hover on Currency Dropdown and click")
    public void iMouseHoverOnCurrencyDropdownAndClick() {
        new HomePage().mouseHoverOnCurrencyDropdownAndClick();
    }


    @And("I Mouse hover on £Pound Sterling and click")
    public void iMouseHoverOn£PoundSterlingAndClick() {
        new HomePage().mouseHoverOnPoundAndClick();
    }


    @And("I Select product {string}")
    public void iSelectProduct(String product) {
        new DesktopsPage().selectProductByName(product);
    }


    @And("I Verify the Text {string}")
    public void iVerifyTheText(String product) {
        String expectedMessage1 = product;
        String actualMessage1 = new DesktopsPage().gettingTextOfProductName(product);
        Assert.assertEquals(actualMessage1,expectedMessage1,"Incorrect Product");

    }

    @And("I Enter Qty {string} using Select class.")
    public void iEnterQtyUsingSelectClass(String qty) {
        new ProductPage().enterQuantity(qty);
    }

    @And("I Click on “Add to Cart” button")
    public void iClickOnAddToCartButton() {
        new ProductPage().clickOnAddToCartButton();
    }

    @And("I get the message Success: You have added {string} to your shopping cart!")
    public void iGetTheMessageSuccessYouHaveAddedToYourShoppingCart(String product) {
        String expectedMessage = "Success: You have added " + product + " to your shopping cart!\n" + "×";
        String actualMessage = new ProductPage().getProductAddedSuccessMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "Incorrect Text!");

    }

    @And("I Click on link “shopping cart” display into success message")
    public void iClickOnLinkShoppingCartDisplayIntoSuccessMessage() {
        new ShoppingCartPage().clickOnShoppingCartDisplay();
    }

    @And("I Verify the Product name {string}")
    public void iVerifyTheProductName(String productName) {
        String expectedName = productName;
        String actualName = new ShoppingCartPage().getProductName();
        Assert.assertEquals(actualName, expectedName, "Incorrect Text!");
    }

    @And("I Verify the Model {string}")
    public void iVerifyTheModel(String model) {
        String expectedModel = model;
        String actualModel = new ShoppingCartPage().getModel();
        Assert.assertEquals(actualModel, expectedModel, "Incorrect Model!");
    }

    @Then("I Verify the Total {string}")
    public void iVerifyTheTotal(String total) {
        String expectedTotal = total;
        String actualTotal = new ShoppingCartPage().getTotal();
        Assert.assertEquals(actualTotal, expectedTotal, "Incorrect Total!");

    }
}


