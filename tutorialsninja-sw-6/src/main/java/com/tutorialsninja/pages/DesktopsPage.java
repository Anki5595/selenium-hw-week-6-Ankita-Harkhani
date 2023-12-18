package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
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
    @FindBy(xpath = "//h4/a")
    List<WebElement> listOfProducts;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']")
    WebElement descendingOrder;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']")
    WebElement ascendingOrder;

    @CacheLookup
    @FindBy(tagName = "(//div[@class='row'])[6]")
    WebElement product;

    public void verifySortedElementsInReverseOrder() {
        List<WebElement> elements = listOfProducts;
        ArrayList<String> originalElementList = new ArrayList<>();
        for (WebElement e : elements) {
            originalElementList.add(e.getText());
        }
        System.out.println(originalElementList);

        Collections.reverse(originalElementList);
        System.out.println(originalElementList);

        elements = listOfProducts;
        ArrayList<String> afterSortByReverseList = new ArrayList<>();
        for (WebElement e : elements) {
            afterSortByReverseList.add(e.getText());
        }
        System.out.println(afterSortByReverseList);
        log.info("Get elements sorted in reverse order" + descendingOrder.toString());

    }

    public void selectSortByOption(String option) {
        selectByVisibleTextFromDropDown(descendingOrder, option);
        log.info("Select sortBy " + option + " in descending order " + descendingOrder.toString());

    }

    public void sortByNameAToZPosition(String option) {
        selectByVisibleTextFromDropDown(ascendingOrder, option);
        log.info("Select sortBy " + option + " in ascending order " + ascendingOrder.toString());
    }

    public void selectProduct(String products) {
        sendTextToElement(product, products);
        mouseHoverToElementAndClick(product);
        log.info("Select product from " + products + product.toString());
    }
}
