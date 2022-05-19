package com.automation.cucumber.steps;

import com.automation.cucumber.pages.HomePage;
import com.automation.cucumber.pages.SignInPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SignSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on Sign in link$")
    public void iClickOnSignInLink() {
        new HomePage().clickOnSignInLink();
    }

    @Then("^I should navigate to Sign in Page successfully$")
    public void iShouldNavigateToSignInPageSuccessfully() {
        String expectedMessage = "AUTHENTICATION";
        String actualMessage = new SignInPage().verifyAuthenticationText();
        Assert.assertEquals("Sign in Page not displayed",expectedMessage,actualMessage);
    }

    @Then("^I sign in with username \"([^\"]*)\" password \"([^\"]*)\" and see the error message \"([^\"]*)\"$")
    public void iSignInWithUsernamePasswordAndSeeTheErrorMessage(String username, String password, String message){
        new SignInPage().signInWithUserNameAndPassword(username,password);
        String expectedMessage = message;
        String actualMessage = new SignInPage().getVerifyAuthenticationFailedMessage();
        Assert.assertEquals("Error message not displayed ",expectedMessage,actualMessage);
    }

    @When("^I Sign in with username \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iSignInWithUsernameAnd(String username, String password) {
       new SignInPage().signInWithUserNameAndPassword(username, password);
    }

    @Then("^I should see Sign out link is displayed$")
    public void iShouldSeeSignOutLinkIsDisplayed() {
        String extpectedText = "Sign out";
        String actualText = new SignInPage().verifyLogOutLink();
        Assert.assertEquals("Sign out link not displayed",extpectedText,actualText);
    }

    @Then("^I click on Sign out link$")
    public void iClickOnSignOutLink() {
        new SignInPage().clickOnSignOut();
    }

    @Then("^I should see Sign in link on Home page$")
    public void iShouldSeeSignInLinkOnHomePage() {
        String expectedText = "Sign in";
        String actualText = new HomePage().signInLinkVerify();
        Assert.assertEquals("Navigated to the HomePage successfully",expectedText,actualText);
    }
}
