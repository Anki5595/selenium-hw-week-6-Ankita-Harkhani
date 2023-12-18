package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerPageSteps {
    @When("I click on computer tab")
    public void iClickOnComputerTab() {
        new HomePage().selectMenu("Computers");
    }

    @And("I should navigate to computer page successfully")
    public void iShouldNavigateToComputerPageSuccessfully() {
    }

    @Then("I should get computer text {string}")
    public void iShouldGetComputerText(String computerText) {
        Assert.assertEquals(new ComputerPage().getComputerText(), computerText, "Incorrect text");
    }

    @And("I click on desktop tab")
    public void iClickOnDesktopTab() {
        new HomePage().clickOnDesktop();
    }

    @And("I should navigate to desktop page successfully")
    public void iShouldNavigateToDesktopPageSuccessfully() {
    }

    @Then("I should get a desktop text {string}")
    public void iShouldGetADesktopText(String desktopText) {
        Assert.assertEquals(new DesktopsPage().getDesktopsText(), desktopText, "Incorrect text");
    }

    @And("I click on product name {string}")
    public void iClickOnProductName(String productName) {
        new DesktopsPage().clickBuildOnComputer();
    }

    @And("I select processor {string}")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("I select RAM {string}")
    public void iSelectRAM(String ram) {
        new BuildYourOwnComputerPage().selectRAM(ram);
    }

    @And("I select HDD {string}")
    public void iSelectHDD(String hdd) {
        new BuildYourOwnComputerPage().selectHDD(hdd);
    }

    @And("I select  OS {string}")
    public void iSelectOS(String os) {
        new BuildYourOwnComputerPage().selectOS(os);
    }

    @And("I select  Software {string}")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @And("I click on ADD TO CART Button")
    public void iClickOnADDTOCARTButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartLink();
    }

    @Then("I should get message {string}")
    public void iShouldGetMessage(String message) {
        Assert.assertEquals(new BuildYourOwnComputerPage().getMessageText(), message, "Incorrect Message");
    }

}
