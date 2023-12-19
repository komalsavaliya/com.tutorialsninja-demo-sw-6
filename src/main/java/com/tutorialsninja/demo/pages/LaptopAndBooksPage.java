package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class LaptopAndBooksPage extends Utility {
    private static final Logger log = LogManager.getLogger(LaptopAndBooksPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Laptops & Notebooks')]")
    WebElement laptopsAndNotebooksText;

    @CacheLookup
    @FindBy(xpath = "//p[@class ='price']")
    List<WebElement> productsPrices;

    @CacheLookup
    @FindBy(xpath = "//h4/a")
    List<WebElement> productsList;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortBy;

    @CacheLookup
    @FindBy(xpath = "//p[@class ='price']")
    WebElement arrayListOfProducts;

    @CacheLookup
    @FindBy(linkText = "MacBook")
    WebElement product;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='MacBook']")
    WebElement checkTextMacBook;
    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successMessageForAddingProduct;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement linkToShoppingCartInsideMessage;

    public String getLaptopsAndNotebooksText() {
        log.info("Getting laptops and notebooks text : " + laptopsAndNotebooksText.toString());
        return getTextFromElement(laptopsAndNotebooksText);
    }

    public ArrayList<Double> getProductsPriceList() {
        List<WebElement> products = webElementList((By) productsPrices);
        ArrayList<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        log.info("Getting product price list : " + getProductsPriceList().toString());
        return originalProductsPrice;
    }

    public void selectSortByOption(String option) {
        selectByVisibleTextFromDropDown(sortBy, option);
        log.info("Select sort by option : " + sortBy.toString());
    }

    public void selectProductByName(String product) {
        List<WebElement> products = webElementList((By) productsList);
        for (WebElement e : products) {
            if (e.getText().equals(product)) {
                e.click();
                break;
            }
        }
        log.info("Select product name : " + productsList.toString());
    }

    public String verifyProductPriceArrangeInHighToLow() {
        log.info("Verify product price Arrange in Order : " + arrayListOfProducts.toString());
        return verifyTheProductArrangementInArrayList(arrayListOfProducts);
    }

    public void selectMacBookProduct() {
        clickOnElement(product);
        log.info("Select product: " + product.toString());
    }

    // * 2.5 Verify the text “MacBook”
    public void verifyTheTextMacBook(String text) {
        verifyThatTextIsDisplayed(checkTextMacBook, text);
        log.info("Getting text : " + checkTextMacBook.toString());
    }
    // * 2.6 Click on ‘Add To Cart’ button
    public void clickOnAddToCart() {
        clickOnElement(addToCart);
        log.info("Add to cart : " + addToCart.toString());
    }

    // * 2.7	Verify the message “Success: You have added MacBook to your shopping cart!”
    public void verifySuccessMessageForAddingProductToShoppingCart(String text) {
        verifyThatTextIsDisplayed(successMessageForAddingProduct, text);
        log.info("Getting text : " + successMessageForAddingProduct.toString());
    }

    // * 2.8	Click on link “shopping cart” display into success message
    public void clickOnLinkToShoppingCartMessage() {
        clickOnElement(linkToShoppingCartInsideMessage);
        log.info("Click on Shopping cart : " + linkToShoppingCartInsideMessage);
    }

}
