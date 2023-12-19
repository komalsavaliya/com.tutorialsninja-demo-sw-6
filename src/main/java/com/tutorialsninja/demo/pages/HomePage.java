package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*")
    List<WebElement> topMenu;

    //Click On Desktop TAB
    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopLink;

    //Click on all Desktops
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Show AllDesktops']")
    WebElement showAllDesktops;


    //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptopsAndNotebooksLink;

    @CacheLookup
    @FindBy(linkText = "Show AllLaptops & Notebooks")
    WebElement showAllLaptopsAndNotebooks;

    //3.1 Mouse hover on “Components” Tab and click
    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement componentsLink;

    @CacheLookup
    @FindBy(linkText = "Show AllComponents")
    WebElement showAllComponents;


    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Currency')]")
    WebElement currencyTab;

    @CacheLookup
    @FindBy(xpath = "//ul[@class = 'dropdown-menu']/li")
    WebElement currencyList;

    @CacheLookup
    @FindBy(xpath = "//button[@class='btn btn-link dropdown-toggle']")
    WebElement dropdown;

    @CacheLookup
    @FindBy(xpath = "(//button[normalize-space()='£Pound Sterling'])[1]")
    WebElement sterling;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement accountTab;

    @CacheLookup
    @FindBy(xpath = "//div[@id='top-links']//li[contains(@class,'open')]/ul/li")
    WebElement myAccountOptions;


    //------------------------------------------------------------------------------//


    public void selectMenu(String menu) {
        List<WebElement> topMenuList = topMenu;
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = topMenu;
        }
        log.info("Selecting menu : " + topMenu.toString());
    }

    public void mouseHoverOnDesktopsLink() {
        mouseHoverToElement(desktopLink);
        log.info("Mouse hovering on desktops link : " + desktopLink.toString());
    }
    public void mouseHoverOnShowAllDesktopsLinkAndClick() {
        mouseHoverToElementAndClick(showAllDesktops);
        log.info("Mouse hovering on desktops link and click : " +showAllDesktops.toString());
    }
    public void mouseHoverOnLaptopsAndNotebooksLinkAndClick() {
        mouseHoverToElementAndClick(laptopsAndNotebooksLink);
        log.info("Mouse hovering on desktops link and click : " + laptopsAndNotebooksLink.toString());
    }
    public void mouseHoverOnShowAllLaptopsAndNotebooksLinkAndClick() {
        mouseHoverToElementAndClick(showAllLaptopsAndNotebooks);
        log.info("Mouse hovering on desktops link and click : " +showAllLaptopsAndNotebooks.toString());
    }

    public void mouseHoverOnComponentLinkAndClick() {
        mouseHoverToElementAndClick(componentsLink);
        log.info("Mouse hovering on desktops link and click : " + componentsLink.toString());
    }
    public void mouseHoverOnAllComponentLinkAndClick() {
        mouseHoverToElementAndClick(showAllComponents);
        log.info("Mouse hovering on desktops link and click : " + showAllComponents.toString());
    }

    public void selectCurrency(String currency) {
        waitUntilVisibilityOfElementLocated(currencyTab, 5).click();
        List<WebElement> listOfElements = webElementList((By) currencyList);
        for (WebElement e : listOfElements) {
            if (e.getText().equalsIgnoreCase(currency)) {
                e.click();
                break;
            }
        }
        log.info("Selecting currency : " + currencyTab.toString());
    }
    public void clickOnMyAccountTab() {
        clickOnElement(accountTab);
        log.info("Click on my account tab : " + accountTab.toString());
    }

    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountList = getListOfElements((By) myAccountOptions);
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = getListOfElements((By)myAccountOptions);
        }
    }

//    public void selectMyAccountOptions(String option) {
//        List<WebElement> myAccountList = getListOfElements(myAccountOptions);
//        try {
//            for (WebElement options : myAccountList) {
//                if (options.getText().equalsIgnoreCase(option)) {
//                    options.click();
//                }
//            }
//        } catch (StaleElementReferenceException e) {
//            myAccountList = getListOfElements(myAccountOptions);
//        }
//    }
    public void mouseHoverOnCurrencyDropdownAndClick() {
        mouseHoverToElementAndClick(dropdown);
        log.info("Currency dropdown : " + dropdown.toString());
    }

    public void mouseHoverOnPoundAndClick() {
        mouseHoverToElementAndClick(sterling);
        log.info("Currency select : " + sterling.toString());
    }

}
