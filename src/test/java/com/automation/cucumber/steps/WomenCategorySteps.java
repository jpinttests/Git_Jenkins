package com.automation.cucumber.steps;

import com.automation.cucumber.pages.HomePage;
import com.automation.cucumber.pages.WomenCategoryPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class WomenCategorySteps {
    @When("^I click on Women tab$")
    public void iClickOnWomenTab() {
        new HomePage().clickOnWomenLink();
    }

    @Then("^I should navigate to women category page$")
    public void iShouldNavigateToWomenCategoryPage() {
        String expectedText = "WOMEN";
        String actualText = new WomenCategoryPage().verifyWomenText();
        Assert.assertEquals("Women Category page not displayed", expectedText, actualText);
    }

    @And("^I click on the product \"([^\"]*)\"$")
    public void iClickOnTheProduct(String product) {
        new WomenCategoryPage().setSelectProduct(product);
    }

    @And("^I change quantity \"([^\"]*)\"$")
    public void iChangeQuantity(String qty) {
        new WomenCategoryPage().enterQty(qty);
    }

    @And("^I select size \"([^\"]*)\"$")
    public void iSelectSize(String size) {
        new WomenCategoryPage().setSelectSize(size);
    }

    @And("^I select colour \"([^\"]*)\"$")
    public void iSelectColour(String colour) {
        new WomenCategoryPage().setSelectColour(colour);
    }

    @And("^click on add to cart button$")
    public void clickOnAddToCartButton() {
        new WomenCategoryPage().setAddToCartButton();
    }

//    @And("^I should see the message confirming that the product successfully added to shopping cart$")
//    public void iShouldSeeTheMessageConfirmingThatTheProductSuccessfullyAddedToShoppingCart() {
//        String expectedMessage = "Product successfully added to your shopping cart";
//        String actualMessage = new WomenCategoryPage().setConfirmationText();
//        Assert.assertEquals("Product is not added to the cart",expectedMessage,actualMessage);
//    }

    @Then("^I click on x button to close the pop up\\.$")
    public void iClickOnXButtonToCloseThePopUp() {
        new WomenCategoryPage().setCloseWindow();
    }

    @And("^I should see the message confirming that the \"([^\"]*)\"$")
    public void iShouldSeeTheMessageConfirmingThatThe(String confirmationMessage)  {
        String actualMessage = new WomenCategoryPage().setConfirmationText();
        Assert.assertEquals("Product is not added to the cart", confirmationMessage, actualMessage);
    }

    @And("^I verify that popup message is displayed$")
    public void iVerifyThatPopupMessageIsDisplayed()  {
        Assert.assertTrue(new WomenCategoryPage().verifyThatPopUpIsDisplayed());
    }
}
