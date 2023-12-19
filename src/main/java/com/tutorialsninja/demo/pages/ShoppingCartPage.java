package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']//h1")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//input[@class='form-control']")
    WebElement clearTheQtyBox;

    @CacheLookup
    @FindBy(xpath = "//input[@class='form-control']")
    WebElement changeQuantity;

    @CacheLookup
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    WebElement updateTheBox;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement modifiedSuccessMessage;

    @CacheLookup
    @FindBy(xpath = "(//td[contains(text(),'£737.45')])[3]")
    WebElement totalPrice;

    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement checkOutButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]")
    WebElement deliveryDate;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[3]")
    WebElement model;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement total;

    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'MacBook')])[2]")
    WebElement checkNameOfProductMacBook;

    @CacheLookup
    @FindBy(xpath = "//button[contains(@data-original-title, 'Update')]")
    WebElement qtyUpdateBtn;

    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-cart']/div[1]")
    WebElement successModifiedMessage;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement clickOnShoppingCartDisplay;



//---------------------------------------------------------------------------------------------//

    public String getShoppingCartText() {
        log.info("Getting shopping cart text : " + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }

    public String getProductName() {
        log.info("Getting product name : " + productName.toString());
        return getTextFromElement(productName);
    }

    public String verifyProductNameIsMacBook(){
        log.info("Getting product name : " + checkNameOfProductMacBook.toString());
        return getTextFromElement(checkNameOfProductMacBook);
    }
    public void clearTheQtyBox() {
        clearTextFromField(clearTheQtyBox);
        log.info("Changing quantity : " + clearTheQtyBox.toString());
    }

    public void enterQuantityInToTheBox(String qty){
        sendTextToElement(changeQuantity,qty);
        log.info("Enter quantity : " + changeQuantity);
    }
    public void clickOnUpdateTheQuantityBox(){
        clickOnElement(updateTheBox);
        log.info("Click on “Update” Tab : " + updateTheBox.toString());
    }

    public String verifyUpdatedSuccessMessage(){
        log.info("Getting text : " + modifiedSuccessMessage.toString());
        return getTextFromElement(modifiedSuccessMessage);
    }

    public String verifyTotalPrice(){
        log.info("Getting text : " + verifyTotalPrice().toString());
        return getTextFromElement(totalPrice);
    }

    public void clickOnCheckOutButton() {
        clickOnElement(checkOutButton);
        log.info("Click on check out button : " + checkOutButton.toString());
    }


    public String getDeliveryDate() {
        log.info("Getting delivery date : " + deliveryDate.toString());
        return getTextFromElement(deliveryDate);
    }

    public String getModel() {
        log.info("Getting model : " + model.toString());
        return getTextFromElement(model);
    }

    public String getTotal() {
        log.info("Getting total : " + total.toString());
        return getTextFromElement(total);
    }
    public void clickOnQtyUpdateButton() {
        clickOnElement(qtyUpdateBtn);
        log.info("Clicking on quantity update button : " + qtyUpdateBtn.toString());
    }
    public String getSuccessModifiedMessage() {
        log.info("Getting success modified message : " + successModifiedMessage.toString());
        return getTextFromElement(successModifiedMessage);
    }
    public void clickOnShoppingCartDisplay(){
        clickOnElement(clickOnShoppingCartDisplay);
        log.info("Click on Shopping Cart : " + clickOnShoppingCartDisplay.toString());
    }
    }


