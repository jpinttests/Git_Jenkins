package com.automation.cucumber.pages;

import com.automation.cucumber.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']//li//a[contains(text(),'Women')]")
    WebElement womenLink;

    @FindBy(xpath = "(//a[contains(text(),'Dresses') and @class='sf-with-ul'])[2]")
    WebElement dressesLink;

    @FindBy(xpath = "(//ul[@style='display: none;']//a[contains(text(),'T-shirts')])[1]")
    WebElement tShirtsLink;

    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement signInLink;

    @FindBy(xpath = "//img[@alt='My Store']")
    WebElement logoLink;

    public void clickOnWomenLink() {
        Reporter.log("clicking on Women link" + womenLink.toString()+"<br>");
        clickOnElement(womenLink);
    }

    public void clickOnDressesLink() {
        Reporter.log("clicking on Dresses link" + dressesLink.toString()+"<br>");
        clickOnElement(dressesLink);
    }

    public void clickOnTShirtsLink() {
        Reporter.log("clicking on T-Shirt link" + tShirtsLink.toString()+"<br>");
        clickOnElement(tShirtsLink);
    }

    public void clickOnSignInLink() {
        Reporter.log("clicking on SignIn link" + signInLink.toString()+"<br>");
        clickOnElement(signInLink);
    }

    public String verifyLogo() {
        Reporter.log("Verifying Logo " + logoLink.toString()+"<br>");
        return getTextFromElement(logoLink);
    }

    public String signInLinkVerify() {
        Reporter.log("clicking on Sign in Link " + signInLink.toString()+"<br>");
        return getTextFromElement(signInLink);
    }


}
