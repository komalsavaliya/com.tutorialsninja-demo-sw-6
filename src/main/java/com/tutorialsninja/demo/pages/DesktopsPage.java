package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Desktops']")
    WebElement desktopsText;

    @CacheLookup
    @FindBy(xpath = "//h4/a")
    List<WebElement> productsList;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortBy;
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement positionZtoA;

    @CacheLookup
    @FindBy(css = "div[id='content'] h1")
    WebElement gettingTextOfProductName;


    //-----------------------------------------------------------------------------------//
    public String getDesktopsText() {
        String message = getTextFromElement(desktopsText);
        log.info("Getting desktops text : " + desktopsText.toString());
        return message;
    }

    public void selectProductByName(String product) {
        List<WebElement> products = productsList;
        for (WebElement e : products) {
            if (e.getText().equals(product)) {
                e.click();
                break;
            }
        }
        log.info("Selecting product by name : " + productsList.toString());

    }

    public void verifySortedElementsInReverseOrder() {
        List<WebElement> elements = productsList;
        ArrayList<String> originalElementList = new ArrayList<>();
        for (WebElement e : elements) {
            originalElementList.add(e.getText());
        }
        System.out.println(originalElementList);

        Collections.reverse(originalElementList);
        System.out.println(originalElementList);


        elements = productsList;
        ArrayList<String> afterSortByReverseList = new ArrayList<>();
        for (WebElement e : elements) {
            afterSortByReverseList.add(e.getText());
        }
        System.out.println(afterSortByReverseList);
        log.info("Verifying sorted elements in reverse order : " + productsList.toString());


    }

    public void selectSortByOption(String option) {
        selectByVisibleTextFromDropDown(sortBy, option);
        log.info("Select sort by option : " + sortBy.toString());
    }

    public String gettingTextOfProductName(String productName) {
        String message = getTextFromElement(gettingTextOfProductName);
        log.info("Getting text : " + gettingTextOfProductName.toString());
        return message;
    }

}



