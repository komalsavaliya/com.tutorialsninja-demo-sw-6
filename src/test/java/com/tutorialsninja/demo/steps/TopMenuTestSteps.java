package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.ComponentsPage;
import com.tutorialsninja.demo.pages.DesktopsPage;
import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.LaptopAndBooksPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TopMenuTestSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I Mouse hover on “Desktops” Tab and click")
    public void iMouseHoverOnDesktopsTabAndClick() {
        new HomePage().mouseHoverOnDesktopsLink();
    }

    @And("I call selectMenu method and pass the menu = “Show AllDesktops”")
    public void iCallSelectMenuMethodAndPassTheMenuShowAllDesktops() {
        new HomePage().mouseHoverOnShowAllDesktopsLinkAndClick();
    }

    @Then("I Verify the text ‘Desktops’")
    public void iVerifyTheTextDesktops() {
        String expectedMessage = "Desktops";
        String actualMessage = new DesktopsPage().getDesktopsText();
        Assert.assertEquals(actualMessage, expectedMessage, "Text is Displayed");
    }

    @When("I Mouse hover on “Laptops & Notebooks” Tab and click")
    public void iMouseHoverOnLaptopsNotebooksTabAndClick() {
        new HomePage().mouseHoverOnLaptopsAndNotebooksLinkAndClick();
    }

    @And("I call selectMenu method and pass the menu = “Show All Laptops & Notebooks”")
    public void iCallSelectMenuMethodAndPassTheMenuShowAllLaptopsNotebooks() {
        new HomePage().mouseHoverOnShowAllLaptopsAndNotebooksLinkAndClick();

    }

    @Then("I Verify the text ‘Laptops & Notebooks'")
    public void iVerifyTheTextLaptopsNotebooks() {
        String expectedMessage = "Laptops & Notebooks";
        String actualMessage = new LaptopAndBooksPage().getLaptopsAndNotebooksText();
        Assert.assertEquals(actualMessage, expectedMessage, "Text is Displayed");
    }

    @When("I Mouse hover on “Components” Tab and click")
    public void iMouseHoverOnComponentsTabAndClick() {
        new HomePage().mouseHoverOnComponentLinkAndClick();
    }

    @And("I call selectMenu method and pass the menu = “Show All Components”")
    public void iCallSelectMenuMethodAndPassTheMenuShowAllComponents() {
        new HomePage().mouseHoverOnAllComponentLinkAndClick();
    }

    @Then("I Verify the text ‘Components")
    public void iVerifyTheTextComponents() {
        String expectedMessage = "Components";
        String actualMessage = new ComponentsPage().getComponentsText();
        Assert.assertEquals(actualMessage, expectedMessage, "Text is Displayed");
    }

}



