package com.automation.cucumber.steps;

import com.automation.cucumber.pages.CreateAccountPage;
import com.automation.cucumber.pages.SignInPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static com.automation.cucumber.utility.Utility.getRandomString;

public class CreateAccountSteps {

    public static String email = getRandomString(5) + "@gmail.com";
    @When("^I enter email and click on create an account button$")
    public void iEnterEmailAndClickOnCreateAnAccountButton() {
        new SignInPage().clickOnCreateAnAccount(email);
    }


    @When("^I fill all mandatory fields of personal information form with firstname \"([^\"]*)\",lastname \"([^\"]*)\"and password\"([^\"]*)\"$")
    public void iFillAllMandatoryFieldsOfPersonalInformationFormWithFirstnameLastnameAndPassword(String firstname, String lastname, String password) {
       new CreateAccountPage().fillPersonalInformationForm(firstname, lastname, password);
    }

    @When("^I fill all mandatory fields of address details form with addL\"([^\"]*)\" city\"([^\"]*)\" state\"([^\"]*)\" zipCd\"([^\"]*)\" country\"([^\"]*)\" mobNo\\.\"([^\"]*)\" addAlias\"([^\"]*)\" and click on register button$")
    public void iFillAllMandatoryFieldsOfAddressDetailsFormWithAddLCityStateZipCdCountryMobNoAddAliasAndClickOnRegisterButton(String addL1, String city, String state, String zipCd, String country, String mobNo, String addAlias){
       new CreateAccountPage().fillYourAddressDetails(addL1, city, state, zipCd, country, mobNo, addAlias);
    }

    @Then("^I should navigate to my account page$")
    public void iShouldNavigateToMyAccountPage() {
        String expectedText = "My account";
        String actualText = new CreateAccountPage().verifyMyAccountText();
        Assert.assertEquals("My Account page not displayed",expectedText,actualText);

    }
}
